package in.sameeerit.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.sameeerit.entity.CitizenPlan;
import in.sameeerit.repo.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {
	
	@Autowired
	private CitizenPlanRepository repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		repo.deleteAll();
		
		// Cash plan data
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Sameer");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approvel");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(5000.00);
		
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Mantoo");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denial");
        c2.setDenialReason("Rental Income");
        
        CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Sara");
		c3.setGender("fe-Male");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
        c3.setBenefitAmt(5000.00);
        c3.setTerminatedDate(LocalDate.now());
        c3.setTerminationRsn("Employed");
        
        
            // Food plan data
     		CitizenPlan c4 = new CitizenPlan();
     		c4.setCitizenName("amjad");
     		c4.setGender("Male");
     		c4.setPlanName("Food");
     		c4.setPlanStatus("Approvel");
     		c4.setPlanStartDate(LocalDate.now());
     		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
     		c4.setBenefitAmt(6000.00);
     		
     		CitizenPlan c5 = new CitizenPlan();
     		c5.setCitizenName("Dallu");
     		c5.setGender("Male");
     		c5.setPlanName("Food");
     		c5.setPlanStatus("Denial");
            c5.setDenialReason("Property Income");
             
            CitizenPlan c6 = new CitizenPlan();
     		c6.setCitizenName("Sana");
     		c6.setGender("fe-Male");
     		c6.setPlanName("Food");
     		c6.setPlanStatus("Terminated");
     		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
     		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
            c6.setBenefitAmt(5000.00);
            c6.setTerminatedDate(LocalDate.now());
            c6.setTerminationRsn("Employed");
            
         // Medical plan data
    		CitizenPlan c7 = new CitizenPlan();
    		c7.setCitizenName("Aditya");
    		c7.setGender("Male");
    		c7.setPlanName("Medical");
    		c7.setPlanStatus("Approvel");
    		c7.setPlanStartDate(LocalDate.now());
    		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
    		c7.setBenefitAmt(5000.00);
    		
    		CitizenPlan c8 = new CitizenPlan();
    		c8.setCitizenName("Sara ali khan");
    		c8.setGender("Fe-Male");
    		c8.setPlanName("Medical");
    		c8.setPlanStatus("Denial");
            c8.setDenialReason("Rental Income");
            
            CitizenPlan c9 = new CitizenPlan();
    		c9.setCitizenName("Muskan");
    		c9.setGender("fe-Male");
    		c9.setPlanName("Medical");
    		c9.setPlanStatus("Terminated");
    		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
    		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
            c9.setBenefitAmt(5000.00);
            c9.setTerminatedDate(LocalDate.now());
            c9.setTerminationRsn("Gov Jobs");
            
            
         // Employement plan data
    		CitizenPlan c10 = new CitizenPlan();
    		c10.setCitizenName("Prtik");
    		c10.setGender("Male");
    		c10.setPlanName("Emplyment");
    		c10.setPlanStatus("Approvel");
    		c10.setPlanStartDate(LocalDate.now());
    		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
    		c10.setBenefitAmt(5000.00);
    		
    		CitizenPlan c11 = new CitizenPlan();
    		c11.setCitizenName("preetam");
    		c11.setGender("Male");
    		c11.setPlanName("Employment");
    		c11.setPlanStatus("Denial");
            c11.setDenialReason("Rental Income");
            
            CitizenPlan c12 = new CitizenPlan();
    		c12.setCitizenName("Simran");
    		c12.setGender("fe-Male");
    		c12.setPlanName("Employments");
    		c12.setPlanStatus("Terminated");
    		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
    		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
            c12.setBenefitAmt(5000.00);
            c12.setTerminatedDate(LocalDate.now());
            c12.setTerminationRsn("Gov Jobs");
            
            List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
            repo.saveAll(list);
	}

}
