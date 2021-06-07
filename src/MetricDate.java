import java.time.LocalDateTime;
import java.util.Scanner;
public class MetricDate extends JulianDate{
	
	public static final LocalDateTime DATE1 = LocalDateTime.of(-4712, 1, 1, 12, 0);

	private int metricYear;
	private int metricMonth;
	private int metricWeek;
	private int metricDay;
	
	int julianDate;
	
	public static MetricDate MetricDateFromInput() {
		Scanner sc;
		int year;
		int month;
		int day;
		
		sc = new Scanner(System.in);
		System.out.print("Please enter year of birth:");
		year = sc.nextInt();
		System.out.print("Please enter month of birth:");
		month = sc.nextInt();
		System.out.print("Please enter day of birth:");
		day = sc.nextInt();
		sc.close();
		
		JulianDate jdate = JulianDate.of(year, month, day) ;
//		MetricDate(jdate);
		return new MetricDate(jdate);
	}
	
	public MetricDate(JulianDate date) {
		julianDate = date.JD;
		metricYear = date.JD/1000;
		int metricHelp = date.JD % 1000;
		metricMonth = metricHelp / 100;
		metricHelp = metricHelp % 100;
		metricWeek = metricMonth / 10;
		metricHelp = metricHelp % 10;
		metricDay = metricWeek / 1;
		
	}
		
	public void countYears() {
		JulianDate jd = JulianDate.now();

		int diff = jd.get() - julianDate;		
		int years = diff / 1000;		
		System.out.println("In metric years you are " + years + " years old.");
	}
	
	public static void main(String[] args) {
		MetricDate m = MetricDateFromInput();
		m.countYears();
	}	

	public static MetricDate convertJulianToMetric(JulianDate julian){
		return new MetricDate(julian);
	}
	
	public static JulianDate convertMetricToJulian(MetricDate metric) {
		return new JulianDate(metric.julianDate);
	}
}
