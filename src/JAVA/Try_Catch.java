package JAVA;

class AmalException extends Exception{

}
class NithinException extends Exception{

}
public class Try_Catch {
    public static void main(String[] args){
        int arr[] = {2,3,4,5,6};
        try {
            //System.out.println(arr[3] / 0);
            // throw new AmalException();
            throw new NithinException();
        }
//        }catch (amalException amal){
//            System.out.println(amal);
//        }
        catch (ArrayIndexOutOfBoundsException exp){
            System.out.println("WRONG " +exp);
        } catch (NithinException nithin){
            System.out.println(nithin);
        } catch (Exception e) {
            System.out.println("ERRROR " +e);
        } finally {
            System.out.println("finally block");
        }
    }
}
