package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface
{

	public boolean checkUser(User user) {
		boolean flag = false;
		if((user.getAge() <= 35 && user.getAge() >=18) && (user.getHeight() >= 155 && user.getHeight() <= 170) && (user.getWeight() >= 55 && user.getWeight() <= 90) && (user.getCountry() == "ProGrad"))
		flag = true;
		return flag;
	}
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		int point = Integer.parseInt(points);
		if(point > 80)
			return true;
		else
			return false;
	}
	public boolean basicEligibilityCheck(User user) {
		return checkUser(user);
		
	}
}
