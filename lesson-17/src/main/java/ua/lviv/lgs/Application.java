package ua.lviv.lgs;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws ParseException {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		UnivercityService service = ctx.getBean(UnivercityService.class);

//		Univercity u1 = new Univercity();
//		u1.setName("Jan");
//		u1.setAccreditationLevel(3);
//		u1.setInstitutesNumbers(4);
//		u1.setStudentsAmount(12000);
//		u1.setUnivercityAdresses("jan@mail.com");
//		
//		Univercity u2 = new Univercity();
//		u2.setName("Maxim");
//		u2.setAccreditationLevel(1);
//		u2.setInstitutesNumbers(16);
//		u2.setStudentsAmount(1200);
//		u2.setUnivercityAdresses("maxim@mail.com");
//		
//		Univercity u3 = new Univercity();
//		u3.setName("Oksana");
//		u3.setAccreditationLevel(1);
//		u3.setInstitutesNumbers(11);
//		u3.setStudentsAmount(14500);
//		u3.setUnivercityAdresses("oksana@mail.com");
//		
//		Univercity u4 = new Univercity();
//		u4.setName("vasul");
//		u4.setAccreditationLevel(4);
//		u4.setInstitutesNumbers(9);
//		u4.setStudentsAmount(200);
//		u4.setUnivercityAdresses("vasul@mail.com");
//		
//		Univercity u5 = new Univercity();
//		u5.setName("Taras");
//		u5.setAccreditationLevel(5);
//		u5.setInstitutesNumbers(1);
//		u5.setStudentsAmount(19000);
//		u5.setUnivercityAdresses("taras@mail.com");
//
//		// save user to DB
//		service.save(u1);
//		service.save(u2);
//		service.save(u3);
//		service.save(u4);
//		service.save(u5);

		// read from DB
		System.out.println(service.findById((long) 1));

		
		
		// update from DB
//		Univercity univercityforUpdate = service.findById((long) 5);
//		univercityforUpdate.setUnivercityAdresses("updatedEmail@gmail.com");
//		service.update(univercityforUpdate);
//
//		// readAll
		service.findAll().stream().forEach(System.out::println);
//		
		service.deleteById((long)3);

	}
}