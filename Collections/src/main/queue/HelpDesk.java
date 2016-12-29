package main.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;

public class HelpDesk {

	private static final Comparator<Enquiry> BY_CATEGORY = new Comparator<Enquiry>() {
		public int compare(Enquiry o1, Enquiry o2) {
			return o1.getCategory().compareTo(o2.getCategory());
		}
	};

	private final Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

	public void enquire(final Customer customer, final Category category) {

		enquiries.offer(new Enquiry(customer, category));
	}

	public void processGeneralEnquiries() {
		String message = "Have you tried turning it off and on again?";
		Predicate<Enquiry> predicate = enq -> enq.getCategory() == Category.PRINTER;

		processEnquiry(predicate, message);

	}

	public void processPrinterEnquiry() {
		String message = "Is it out of paper.";
		Predicate<Enquiry> predicate = enq -> enq.getCategory() != Category.PRINTER;
		//using predicate to remove duplicate code
		processEnquiry(predicate, message);
	}

	private void processEnquiry(Predicate<Enquiry> predicate, String message) {
		Enquiry enquiry = enquiries.peek();

		if (enquiry != null && predicate.test(enquiry)) {

			enquiries.remove();
			enquiry.getCustomer().relpy(message);
		} else {
			System.out.println("No work to do.");
		}
	}

}
