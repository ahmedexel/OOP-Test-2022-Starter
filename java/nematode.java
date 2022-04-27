package ie.tudublin;

public class nematode
{
    private String name;
    private float length;
    private boolean limbs;
    private char gender;
    private boolean eyes;




    public nematode(TableRow tr)
    {
        this(
            tr.getString("name"), 
            tr.getFloat("length"),
            tr.getInt("limbs") == 1, 
            tr.getchar("gender"),
            tr.getInt("eyes") == 1
        );
    }



    public nematode(String name, float length, boolean limbs, char gender, boolean eyes) {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public boolean isLimbs() {
        return limbs;
    }
    public void setLimbs(boolean limbs) {
        this.limbs = limbs;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public boolean isEyes() {
        return eyes;
    }
    public void setEyes(boolean eyes) {
        this.eyes = eyes;
    }

    


}


