package Tree;

import java.util.ArrayList;

public class Generic_Heap {
    private ArrayList<Integer> list = new ArrayList<>();
    public void add(int item){
        list.add(item);
        UpHeapify(list.size()-1);
    }
    private void UpHeapify(int ci){
        int pi = (ci-1)/2;   // parent index (pi) , child index (ci)
        if(list.get(pi)>list.get(ci)){
            swap(pi,ci);
        }
    }
    public void swap(int i, int j){
        int ith = list.get(i);
        int jth = list.get(j);
        list.set(i,jth);
        list.set(j,ith);
    }
    public int remove(){
        swap(0,list.size()-1);
        int rv = list.remove(list.size()-1);
        doenHeapify(0);
        return rv;
    }
    private void doenHeapify(int pi) {
        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;
        int mini = pi;
        if (lci<list.size() && list.get(mini) > list.get(lci)) {
            mini = lci;
        }
        if (lci<list.size() && list.get(mini)>list.get(rci)){
            mini=rci;
        }
        if(mini!=pi){
            swap(mini,pi);
            doenHeapify(mini);
        }
    }
    public int min(){
        return list.get(0);
    }
    public int size(){
        return list.size();
    }
    public void display(){
        System.out.println(list);
    }
















}
