class Calendar
{
Calendar c = Calendar.getInstance();
c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
for (int i = 0; i <= 4; i++) {
    System.out.println(df.format(c.getTime()));
    c.add(Calendar.DATE, 1);
}
public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
    DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
    for (int i = 0; i <= 10; i++) {
        System.out.println(df.format(c.getTime()));
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == Calendar.FRIDAY) { 
            c.add(Calendar.DATE, 3);
        } else if (dayOfWeek == Calendar.SATURDAY) { 
            c.add(Calendar.DATE, 2);
        } else {
            c.add(Calendar.DATE, 1);
        }
    }
    }
}
