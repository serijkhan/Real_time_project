/*
 * package in.sameeerit.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestParam;
 * 
 * import in.sameeerit.binding.SignUpForm; import
 * in.sameeerit.binding.UnlockForm; import in.sameeerit.service.UserService;
 * 
 * @Controller public class UserController {
 * 
 * @Autowired private UserService userService;
 * 
 * @GetMapping("/signup") public String signUpPage(Model model) {
 * model.addAttribute("user",new SignUpForm()); return "signup"; }
 * 
 * @GetMapping("/signup") public String handleSignUp(@ModelAttribute("user")
 * SignUpForm form, Model model) {
 * 
 * boolean status = userService.signUp(form);
 * 
 * if(status) { model.addAttribute("succMsg",
 * "Account Created, Check Your Email"); }else { model.addAttribute("errorMsg",
 * "Choose Unique Email"); } return "signup"; }
 * 
 * @GetMapping("/unlock") public String unlockPage(@RequestParam String email,
 * Model model) { UnlockForm unlockFormObj = new UnlockForm();
 * unlockFormObj.setEmail(email);
 * 
 * model.addAttribute("unlock", unlockFormObj);
 * 
 * return "unlock"; }
 * 
 * @PostMapping("/unlock") public String
 * unlockUserAccount(@ModelAttribute("unlock") UnlockForm unlock, Model model) {
 * 
 * System.out.println(unlock);
 * 
 * 
 * 
 * return"unlock"; }
 * 
 * 
 * @GetMapping("/login") public String loginPage() { return "login"; }
 * 
 * 
 * 
 * 
 * @GetMapping("/forgot") public String forgotPwdPage() { return "forgotPwd"; }
 * }
 */