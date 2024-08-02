package historyModel;

public class EraComparator {
	
	 public static int compareYears(String year1, String year2) {
		 
			boolean isBc1 = year1.contains("BC");
			boolean isBc2 = year2.contains("BC");

			int numYear1 = parseYear(year1);
			int numYear2 = parseYear(year2);

			if (isBc1 && !isBc2) {
				return -1;
			} else if (!isBc1 && isBc2) {
	            return 1;
			}  else if (isBc1 && isBc2) {
	            return Integer.compare(numYear2, numYear1);
			} else {
	            return Integer.compare(numYear1, numYear2);
			}
		}

		private static int parseYear(String year) {

			if (year.contains("BC")) {
				return Integer.parseInt(year.replace(" BC", "").trim());
			} else {
				return Integer.parseInt(year.trim());
			}
		}

}
