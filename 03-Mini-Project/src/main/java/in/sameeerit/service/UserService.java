package in.sameeerit.service;

import in.sameeerit.binding.LoginForm;
import in.sameeerit.binding.SignUpForm;
import in.sameeerit.binding.UnlockForm;

public interface UserService {
	
	public String login(LoginForm form);
	
	public String signUp(SignUpForm form);
	
	public String unlockAccount(UnlockForm form);
	
	public String forgotPwd(String email);

}
