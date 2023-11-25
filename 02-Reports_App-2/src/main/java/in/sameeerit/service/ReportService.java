package in.sameeerit.service;

import java.util.List;

import in.sameeerit.entity.CitizenPlan;
import in.sameeerit.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanName();
	
	public List<String> getPlanStatus();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();

}
