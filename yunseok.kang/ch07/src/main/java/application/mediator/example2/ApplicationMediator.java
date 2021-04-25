public class ApplicationMediator implements Mediator {

    private ArrayList<Colleague> colleagues;

    public ApplicationMediator() {
        colleagues = new ArrayList<Colleague>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void send(String message, Colleague originator) {
        // Let all other screens know that this screen has changed
        for (Colleague colleague: colleagues) {
            // But not itself
            if (colleague != originator) {
                colleage.receive(message);
            }
        }
    }
}