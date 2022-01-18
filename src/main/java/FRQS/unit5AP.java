package FRQS;

class Unit5AP {
    private String hostName;

    private String address;



    public Unit5AP(String n, String a)

    {

        hostName = n;

        address = a;

    }

    public String getHostName(){
        return hostName;
    }  //part 1a

    public String updateAddress(String newAddress) {  //part 1b
        String newaddress = newAddress;
        return newaddress;
    }
    public String whoInvited( String personInvited){
        String personInvited1 = personInvited;
        String greeting = "Dear " + personInvited1 + ", please attend my event at " + address + ". See you then, " + hostName;
        return greeting;
    }
    public Unit5AP(String address)

    {

        String address1 = address;

        hostName = "Host";

    }
}

