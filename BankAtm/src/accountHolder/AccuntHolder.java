package accountHolder;

import model.model;

public class AccuntHolder implements Runnable {

	private model account;
	public AccuntHolder(model account)
	{
		this.account = account;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++)
		{
			makeWithdrawal(2000);
			if(account.getBlance() < 0)
			{
				System.out.println("insufficient Balance");
			}
			
		}
		
	}
	private synchronized void makeWithdrawal(int withdrawAmount) {
		if (account.getBlance() >= withdrawAmount) {
			System.out.println(Thread.currentThread().getName()	+ " is going to withdraw $"+withdrawAmount);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException ex) {
			}
			account.withdraw(withdrawAmount);
			System.out.println(Thread.currentThread().getName()	+ " completes the withdrawal of $"+withdrawAmount);
		} else {
			System.out.println("Not enough in account for "	+ Thread.currentThread().getName() + " to withdraw "
					+ account.getBlance());
		}
	}
	

}
