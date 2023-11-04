package File;

import java.util.PriorityQueue;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		      
		        priorityQueue.offer(11);
		        priorityQueue.offer(5);
		        priorityQueue.offer(25);
		        priorityQueue.offer(34);
		        priorityQueue.offer(96);
		        priorityQueue.offer(112);
		        
		        System.out.println("queue :"+ priorityQueue);
		        
		        int accesspriorityQueue= priorityQueue.peek();
		        System.out.println("Access element: "+accesspriorityQueue);
		        
		        int removepriorityQueue= priorityQueue.poll();
		        
		        System.out.println("remove element: "+removepriorityQueue);
		        System.out.println("queue element: "+priorityQueue);
		        
		        

		       
		      
		        
		        }
		                }
	

	
