package strassen;

public class Strassen {

    public static void main(String[] args) {
		int a00 = 1, a01 = 2, a10 = 3, a11 = 4, b00 = 5, b01 = 6, b10 = 7, b11 = 8;
		int z1, z2, z3, z4, z5, z6, z7;
		int c00,c01,c10,c11;
		
		z1 = (a00 + a11) * (b00 + b11);
		z2 = (a10+a11)* b00;
		z3 = a00 * (b01 - b11);
		z4 =  a11 * (b10 - b00);
		z5 = (a00 + a01) * b11;
		z6 = (a10 - a00) * (b00 + b01);
		z7 = (a01 - a11) * (b10 + b11);
		
		c00 = z1 + z4 - z5 + z7;
		c01 = z3 + z5;
		c10 = z2 + z4;
		c11 = z1 + z3 - z2 + z6;
		
		System.out.println(c00 + "  " + c01);
		System.out.println(c10 + "  " + c11);
    }
    
}