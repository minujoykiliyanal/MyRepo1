package exceptionhandlingeg;

public class CustomExceptionEx {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age=2;
		if(age>=18) {
			System.out.println(" Eligible for voting");
		}
		else {
			throw new VotingException("Age under 18");
		}
			}

	}


