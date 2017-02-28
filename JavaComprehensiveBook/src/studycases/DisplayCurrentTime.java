
package studycases;

/*You can use this method to obtain the current time, and then compute the current second,
minute, and hour as follows.

1. Obtain the total milliseconds since midnight, January 1, 1970, in totalMilliseconds
by invoking System.currentTimeMillis() (e.g., 1203183068328 milliseconds).

2. Obtain the total seconds totalSeconds by dividing totalMilliseconds by 1000
(e.g., 1203183068328 milliseconds / 1000 = 1203183068 seconds).

3. Compute the current second from totalSeconds % 60 (e.g., 1203183068 seconds
% 60 = 8, which is the current second).

4. Obtain the total minutes totalMinutes by dividing totalSeconds by 60 (e.g.,
1203183068 seconds / 60 = 20053051 minutes).

5. Compute the current minute from totalMinutes % 60 (e.g., 20053051 minutes %
60 = 31, which is the current minute).

6. Obtain the total hours totalHours by dividing totalMinutes by 60 (e.g., 20053051
minutes / 60 = 334217 hours).

7. Compute the current hour from totalHours % 24 (e.g., 334217 hours % 24 = 17,
which is the current hour).*/


public class DisplayCurrentTime {

	public static void main(String[] args) {
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliSeconds = System.currentTimeMillis();
		
		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliSeconds / 1000;
		
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		// Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		// Compute the current hour
		long currentHour = totalHours % 24 + 2;
		
		// Display results
		System.out.println("Current time is " + currentHour +
				":" + currentMinute + ":" + currentSecond + " SET");
		
	}

}
