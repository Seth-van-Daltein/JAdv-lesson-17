package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.Univercity;

public interface UnivercityService {

	Univercity save(Univercity customer);

	Univercity findById(Long id);

	Univercity update(Univercity customer);

	void deleteById(Long id);

	List<Univercity> findAll();

}