# smartcab
CMPE 202 Smart Cab

# smartcab
CMPE 202 Smart Cab

Steps to Run
- Run Main.java class in package com.smartcab.main;
- Below is the one full end-to-end run with inputs: 

Booting System using preloaded data
Booting System using preloaded data Done
*******

Main menu::::
*************************************
select the option from the menu::
1.Manage Service Request
2.Manage Vehicle Inventory
3.Manage Member
4.Operate Dispatcher
6.Exit:
Enter your choice:
*************************************
1

************************************
Request Manager Manu
1. Create New Request
2. Cancel Request
3. Update Request
4. Retrieve Request
5. Exit System
************************************
1
Request Received:ADD_REQUEST

************************************
VehicleType
1. TAXI
2. Share Ride
3. Rent A Car
4. Exit
************************************
1
**********************************************
Creating the Request Object
Enter valid Member Id to process request 
:
1212
Member found: Member [memberId=1212, firstName=Parnit, lastName=Sainion, phoneNo=null, email=null, memberType=null]

Enter The pick up location:
cupertino
Source Location:cupertino
**********************************************
Source GPS
Getting geolocation from the gps for source:GeoLocation [latitude=-115.23, longitude=226.11]
**********************************************

Enter The Destination:
fremont
Destination Location:fremont
**********************************************
Destination GPS
Getting geolocation from gps for destination:GeoLocation [latitude=-111.23, longitude=222.11]
**********************************************
**********************************************
Done Creating the request and put it into the Q
Request is in Processing StateRequest [requestId=195218599, address=Address [sourceAddrsss=cupertino, destinationAddrsss=fremont, addressType=null], geoLocation=GeoLocation [latitude=-115.23, longitude=226.11], client=Member [memberId=1212, firstName=Parnit, lastName=Sainion, phoneNo=null, email=null, memberType=null], state=Recieved, type=TAXI, ]/n
1.Fetch Request Queue
2.Fetch Vehicle Inventory
3.Dispatch
4.Exit
Enter your choice:
3
Dispatching the vehicle.

Processing Dispatch for the request Id: 195218599
Request to be dispatched: Request [requestId=195218599, address=Address [sourceAddrsss=cupertino, destinationAddrsss=fremont, addressType=null], geoLocation=GeoLocation [latitude=-115.23, longitude=226.11], client=Member [memberId=1212, firstName=Parnit, lastName=Sainion, phoneNo=null, email=null, memberType=null], state=Recieved, type=TAXI, ]/n
Initiating Dispatcher Strategy
Setting the Dispatcher Strategy

Request Status :Request [requestId=195218599, address=Address [sourceAddrsss=cupertino, destinationAddrsss=fremont, addressType=null], geoLocation=GeoLocation [latitude=-115.23, longitude=226.11], client=Member [memberId=1212, firstName=Parnit, lastName=Sainion, phoneNo=null, email=null, memberType=null], state=Recieved, type=TAXI, ]/n
Recieved Request.


Found vehicle
Vehicle Details:Vehicle [vehicleId=1234, vehicleBrand=null, vehicleColor=null, modelName=Honda Civic, driverId=1234, vehicleType=YELLOWCAB, geolocation=GeoLocation [latitude=-111.23, longitude=222.11], licencePlate=1234, state=Waiting]
Building Ride using EconomyDecorator pattern

Getting driver informations

Driver Informations:Driver [driverId=1234, vehicle=null, firstName=Soumya, lastname=Acharya, licenceId=1234, driverType=YELLOWCAB, bgCheck=null]

Driver Informations:Driver [driverId=1234, vehicle=null, firstName=Soumya, lastname=Acharya, licenceId=1234, driverType=YELLOWCAB, bgCheck=null]
Dispatching Vehicle

Vehicle: Vehicle [vehicleId=1234, vehicleBrand=null, vehicleColor=null, modelName=Honda Civic, driverId=1234, vehicleType=YELLOWCAB, geolocation=GeoLocation [latitude=-111.23, longitude=222.11], licencePlate=1234, state=dispatched]

Request Status :Request [requestId=195218599, address=Address [sourceAddrsss=cupertino, destinationAddrsss=fremont, addressType=null], geoLocation=GeoLocation [latitude=-115.23, longitude=226.11], client=Member [memberId=1212, firstName=Parnit, lastName=Sainion, phoneNo=null, email=null, memberType=null], state=Processing, type=TAXI, ]/n
Currently Processing request
.

Processing Payment
select the Payment Type
1.CreditCard/Debit Card
2.Cash
3.Check
4.Mobile
1
Processing Payment Using Card:CREDITCARD
******************************
PaymentNotify Observer Is called
******************************
******************************
Dispatch Observer Is called
******************************
******************************
RequestNotify Observer Is called
******************************
Processing Payment using CardPayment
**********************************************
Processing Payment using GenericCardPaymentGateway
Processing Payment using GenericCardPaymentGateway Done
**********************************************
select the Receipt Type
1.Send Email Recepit
2.Send Receipt Via Sms
3.Print Paper Receipt
4.No Reeipt
1
****Getting the Invoice****
Get Invoice12.0
****Getting the Service Tax****
Service Tax Amount12.0
******Sending Email Receipt******* 

******Final Amount******* 

112.0
******Email Receipt Send******* 

Updating the Transaction after Payment.

Request Status :Request [requestId=195218599, address=Address [sourceAddrsss=cupertino, destinationAddrsss=fremont, addressType=null], geoLocation=GeoLocation [latitude=-115.23, longitude=226.11], client=Member [memberId=1212, firstName=Parnit, lastName=Sainion, phoneNo=null, email=null, memberType=null], state=Completed, type=TAXI, ]/n
Vehicle finished ride

Vehicle: Vehicle [vehicleId=1234, vehicleBrand=null, vehicleColor=null, modelName=Honda Civic, driverId=1234, vehicleType=YELLOWCAB, geolocation=GeoLocation [latitude=-111.23, longitude=222.11], licencePlate=1234, state=Waiting]
DispacherStrategy: Dispatching Taxi
1.Fetch Request Queue
2.Fetch Vehicle Inventory
3.Dispatch
4.Exit
Enter your choice:
4
