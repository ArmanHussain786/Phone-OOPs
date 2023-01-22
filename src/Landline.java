public class Landline implements Phone{


    //attributes
    private String myPhoneno;
    private boolean isRinging;
    public boolean isPowerOn;

    public Landline(String myPhoneno) {
        this.myPhoneno = myPhoneno;
        isRinging=false;
        isPowerOn=true;
    }

    public String getMyPhoneno() {
        return myPhoneno;
    }

    public void setMyPhoneno(String myPhoneno) {
        this.myPhoneno = myPhoneno;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public boolean isPowerOn() {
        this.isPowerOn=true;
        return true;
    }

    @Override
    public void CallNumber(String PhoneNo) {
     if(isPowerOn==true)
     {
         System.out.println("You are dialing a Number "+PhoneNo);
     }
     else {
         System.out.println("Your landline is off");
     }
     return;
    }

    @Override
    public void recieveCall(String PhoneNo) {
     if(isPowerOn() && myPhoneno.equals(PhoneNo))
     {
         this.isRinging=true;
         System.out.println("Hey,"+myPhoneno+" you are recieving a call");
     }
     else {
         System.out.println("Call not recieved");
     }
     return;
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true)
        {
            System.out.println("Call Answered");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
