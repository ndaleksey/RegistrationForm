import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

/**
 * Created by Shishkov A.V. on 12.04.18.
 */
public class Main {
	/*private static final SessionFactory ourSessionFactory;

	static {
		try {
			Configuration configuration = new Configuration();
			configuration.configure();

			ourSessionFactory = configuration.buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static Session getSession() throws HibernateException {
		return ourSessionFactory.openSession();
	}*/

	private static String normalizeUuid(UUID id) {
		return id.toString().toUpperCase().replace("-", "");
	}

	public static void main(final String[] args) throws Exception {
//		System.out.println(getProgrammersDay());

		/*UUID id = UUID.randomUUID();
		System.out.println(id);
		System.out.println(normalizeUuid(id));*/

		System.out.println(String.format("Numbers: %1$s, %2$s, %3$s", 1, 2, 3));

		/*final Session session = getSession();
		try {
			System.out.println("querying all the managed entities...");
			final Metamodel metamodel = session.getSessionFactory().getMetamodel();
			for (EntityType<?> entityType : metamodel.getEntities()) {
				final String entityName = entityType.getName();
				final Query query = session.createQuery("from " + entityName);
				System.out.println("executing: " + query.getQueryString());
				for (Object o : query.list()) {
					System.out.println("  " + o);
				}
			}
		} finally {
			session.close();
		}*/
	}

	private static String getProgrammersDay() {
		Calendar cl = new GregorianCalendar(2018, 0, 1);
		cl.add(Calendar.DAY_OF_YEAR, 255);

		return String.format("%1$tY-%1$tm-%1$td", cl);
	}
}