package in.sameeerit.service;

import java.util.List;

import in.sameeerit.binding.DashboardResponse;
import in.sameeerit.binding.EnquiryForm;
import in.sameeerit.binding.EnquirySearchCriteria;

public interface EnquiryService {
	
	public List<String> getCourseName();
	
	public List<String> getEnqStatus();
	
	public DashboardResponse getDashboardData(Integer userId);
	
	public String upsetEnquiry(EnquiryForm form);
	
	public List<EnquiryForm> getEnquries(Integer userId, EnquirySearchCriteria criteria);
	
	public EnquiryForm getEnquiry(Integer enqId);
	

}
