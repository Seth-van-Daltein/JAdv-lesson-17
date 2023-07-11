package ua.lviv.lgs.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Univercity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column
	private String name;

	@Column
	private Integer accreditationLevel;

	@Column
	private Integer institutesNumbers;

	@Column
	private Integer studentsAmount;

	@Column
	private String univercityAdresses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAccreditationLevel() {
		return accreditationLevel;
	}

	public void setAccreditationLevel(Integer accreditationLevel) {
		this.accreditationLevel = accreditationLevel;
	}

	public Integer getInstitutesNumbers() {
		return institutesNumbers;
	}

	public void setInstitutesNumbers(Integer institutesNumbers) {
		this.institutesNumbers = institutesNumbers;
	}

	public Integer getStudentsAmount() {
		return studentsAmount;
	}

	public void setStudentsAmount(Integer studentsAmount) {
		this.studentsAmount = studentsAmount;
	}

	public String getUnivercityAdresses() {
		return univercityAdresses;
	}

	public void setUnivercityAdresses(String univercityAdresses) {
		this.univercityAdresses = univercityAdresses;
	}

	@Override
	public String toString() {
		return "Univercity [id=" + id + ", name=" + name + ", accreditationLevel=" + accreditationLevel
				+ ", institutesNumbers=" + institutesNumbers + ", studentsAmount=" + studentsAmount
				+ ", univercityAdresses=" + univercityAdresses + "]";
	}

}