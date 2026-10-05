package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int curLength = 0;
    int curSize = 0;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        curSize = size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++) {
            list[i] = (int)(Math.random() * 100) + 1;
            curLength++;
        }

    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public boolean isFull() {
        return curSize == curLength;
    }

    public void increaseSize() {
        int[] newList = new int[curSize * 2];
        for(int i = 0; i < curLength; i++) {
            newList[i] = list[i];
        }
        list = newList;
        curSize *= 2;
    }

    public void addElement(int newVal) {
        if(isFull()) increaseSize();

        list[curLength] = newVal;
        curLength++;
    }

    public void removeElement(int newVal) {
        for(int i = 0; i < curLength; i++) {
            if(list[i] == newVal) {
                for(int j = i; j < curLength-1; j++) {
                    list[j] = list[j+1];
                }
                list[curLength - 1] = 0;
                curLength--;
                break;
            }
        }
    }

    public void removeAll(int newVal) {
        for(int i = 0; i < curLength; i++) {
            if(list[i] == newVal) {
                for(int j = i; j < curLength-1; j++) {
                    list[j] = list[j+1];
                }
                list[curLength - 1] = 0;
                curLength--;
                i--;
            }
        }
    }
}