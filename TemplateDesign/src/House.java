public class House {
    /**
     * template
     */
    public final void buildHouse(){
        prepFoundation();
        createFrame();
        installDrywall();
        addWindows();
        addElectrical();
        addPlumbing();
    }
    public void prepFoundation(){
        System.out.println("Foundation: Adding a crawlspace, and a strong backbone.");
    }

    /**
     * method that will be defined for each class extending house
     */
    public void createFrame(){}

    public void installDrywall(){
        System.out.println("Drywall: Creating the interior walls.");
    }
    public void addWindows(){
        System.out.println("Windows: Putting in the glass for the windows.");
    }
    public void addElectrical(){
        System.out.println("Electrical: Running all the wires and hooking up the power.");
    }
    public void addPlumbing(){
        System.out.println("Plumbing: Letting water run through the house.");
    }


}
