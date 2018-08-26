package main.java.com.var.supplychain;

import java.time.Period;
import java.util.Date;
import java.util.Optional;

public class Supply  {
	private Date on;
	private Optional<Integer> set;
	private Optional<Integer> increment;
	private Optional<Period> interval;

	
	public Supply(
			final Date on,
			final Optional<Period> interval,
			 final Optional<Integer> set,
			 final Optional<Integer> increment) {
		this.on = on;
		this.interval = interval;
		this.set = set;
		this.increment = increment;
	}
	
	public Optional<Integer> getIncrement() {
		return increment;
	}
	public Optional<Integer> getSet() {
		return set;
	}
	public Date getOn() {
		return on;
	}
	public Optional<Period> getInterval() {
		return interval;
	}
	
	public String description() {
		System.out.println("just description");
		return "";
	}
}
