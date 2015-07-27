/**
 * 
 */
package com.smartcab.design.request;

import com.smartcab.main.RequestStrategy;


/**
 * @author mahesh
 *
 */
public class RequestManager implements RequestStrategy {
	static RequestManager rm;

	public static RequestManager getInstance(){
		if(rm==null) {
			rm = new RequestManager();
		}
		return rm;
	}

//	public int processRequest{

		//        try {
		//            Scanner scanner = new Scanner(System.in);
		//            int selection = 0;
		//            int selection1 = 0;
		//            System.out.println("Please Make a selection for Service Request:");
		//            System.out.println("Selection: ");
		//            System.out.println("[1] Create Property");
		//            System.out.println("[2] Delete Property");
		//            System.out.println("[3] Update Property ");
		//            System.out.println("[4] Search property");
		//            System.out.println("[0]Enter 0 for Exit");
		//            selection = scanner.nextInt();
		//            switch (selection) {
		//                case 1:
		//                    System.out.println("Choose a type of property");
		//                    System.out.println("[1] TownHome");
		//                    System.out.println("[2] Single Family");
		//                    System.out.println("Selection: ");
		//                    selection1 = scanner.nextInt();
		//                    switch (selection1) {
		//                        case 1:
		//                            TownHome t = new TownHome(4,500);
		//                            System.out.println("Choose type of deal");
		//                            System.out.println("[1] Rent");
		//                            System.out.println("[2]Sale");
		//                            int selection2 = scanner.nextInt();
		//                            switch (selection2) {
		//                                case 1:
		//                                    Rentable townhome = new Rentable(t);
		//                                    townhome.rentProperty();
		//                                    createProperty(t);
		//                                    break;
		//                                case 2:
		//                                    Saleable townhome1 = new Saleable(t);
		//                                    townhome1.saleProperty();
		//                                    createProperty(t);
		//                                    break;
		//                                default:
		//                                    System.out.println("Invalid");
		//                                    break;
		//                            }
		//                            break;
		//                        case 2:
		//                            SingleFamily sf = new SingleFamily(3000,5000);
		//                            System.out.println("Choose type of deal");
		//                            System.out.println("[1] Rent");
		//                            System.out.println("[2] Sale");
		//                            int selection4 = scanner.nextInt();
		//                            switch (selection4) {
		//                                case 1:
		//                                    Rentable SingleFamily = new Rentable(sf);
		//                                    SingleFamily.rentProperty();
		//                                    createProperty(sf);
		//                                    break;
		//                                case 2:
		//                                    Saleable SingleFamily1 = new Saleable(sf);
		//                                    SingleFamily1.saleProperty();
		//                                    createProperty(sf);
		//                                    break;
		//                                default:
		//                                    System.out.println("Invalid");
		//                                    break;
		//                            }
		//                        default:
		//                            System.out.println("Thanks");
		//                            break;
		//                    } //shikha
		//                    break;
		//                case 2:
		//                    System.out.println("Selection: Delete Property");
		//                    System.out.println("Enter the Property Id that you want to delete");
		//                    int val = scanner.nextInt();
		//                    deleteProperty(val);
		//                    break;
		//                case 3:
		//                    System.out.println("Selection: Update Property");
		//                    System.out.println("Enter the Property Id that you want to update");
		//                    int val1 = scanner.nextInt();
		//                    updateProperty(val1);
		//                    break;
		//                    /* System.out.println("What do you want to update");
		//                    System.out.println("[1]Initial Price");
		//                    System.out.println("[2]Start Time");
		//                    System.out.println("[3]End Time");
		//                    System.out.println("[4]Buy Now price");
		//                    System.out.println("[5]Status");
		//                    System.out.println("[6]Owner-contact");*/
		//               case 4:
		//                    System.out.println("Selection: Display property");
		//                    System.out.println("Enter the Property Id that you want to display");
		//                    int val2 = scanner.nextInt();
		//                    Property p2=SearchProperty(val2);
		//                    String PropName=p2.getClass().getName();
		//                     System.out.println("*********************");
		//                     System.out.println("This Property is type of: "+PropName.substring(12,PropName.length()));
		//
		//
		//                    if(PropName.substring(12,PropName.length()).equalsIgnoreCase("TownHome"))
		//                    {
		//                      System.out.println("The TownHome Property has the following attributes: "+PropName);
		//                      p2.displayProperty();
		//                      p2.showProperty(p2);
		//                    }
		//                    if(PropName.substring(12,PropName.length()).equalsIgnoreCase("SingleFamily"))
		//                    {
		//                    // System.out.println("The SingleFamily Property has the following attributes: "+PropName);
		//                     p2.displayProperty();
		//                     // p2.showProperty(p2);
		//                    }
		//                    break;
		//            }
		//        } catch (IOException ex) {
		//            Logger.getLogger(RequestManager.class.getName()).log(Level.SEVERE, null, ex);
		//        }
//	}

}
