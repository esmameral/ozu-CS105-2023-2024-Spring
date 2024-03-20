package week6.oop.examples;

public class StepTracker {
	private int activeDayCount;
	private int totalStepCount;
	private int totalDayCount;
	private int minLimitForActive;

	public StepTracker(int limit) {
		this.minLimitForActive = limit;
	}

	public int activeDays() {
		return activeDayCount;
	}
	public double averageSteps() {
		if (totalDayCount > 0)
			return totalStepCount / totalDayCount;
		else
			return 0;
	}

	public void addDailySteps(int dailyStep) {
		totalStepCount += dailyStep;
		totalDayCount++;
		if (dailyStep >= minLimitForActive) {
			activeDayCount++;
		}

	}

	public int getActiveDays() {
		return activeDayCount;
	}

	public int getTotalSteps() {
		return totalStepCount;
	}

	
}
