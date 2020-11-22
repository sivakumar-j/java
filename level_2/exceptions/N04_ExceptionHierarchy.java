package com.leveltwo.exception;



// 1.Throwable
// --1.1Exception
// ----1.1.1 Checked//use throws
// -------1.1.1.1 IO Exception
// -------1.1.1.2 SQL Exception
// ----1.1.2 Unchecked //no need of throws
// -------1.1.2.1 Runtimeexception
// -------1.1.2.1.1 Arithmetic Exception
// -------1.1.2.1.2 Null pointer exception
// 1.2 Errors


class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	/*
	 * public void add(Amount that) { // no need of throw exception for runtime
	 * exception
	 *
	 * if (!this.currency.equals(that.currency)) {
	 *
	 * throw new RuntimeException("Currencies Don't Match " + this.currency + " & "
	 * + that.currency);
	 *
	 * }
	 *
	 * this.amount = this.amount + that.amount; }
	 */

	/*
	 * public void add(Amount that) throws Exception { // needs to be mentioned what
	 * needs to be throwed
	 *
	 * if (!this.currency.equals(that.currency)) {
	 *
	 * throw new Exception("Currencies Don't Match " + this.currency + " & " +
	 * that.currency);
	 *
	 * }
	 *
	 * this.amount = this.amount + that.amount; }
	 */

	public void add(Amount that) throws CurrenciesDoNotMatchException {

		if (!this.currency.equals(that.currency)) {
			throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " & " + that.currency);
		}

		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

class CurrenciesDoNotMatchException extends Exception {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

public class N04_ExceptionHierarchy {

	// public static void main(String[] args) { // for RuntimeException

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
