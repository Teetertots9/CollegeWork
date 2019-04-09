/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author x00139120
 */
public class Concert {
    private String performer;
    private int concertCapacity;
    private List<Ticket> tickets = new ArrayList<>();
    
    public Concert(String performer, int concertCapacity){
        this.performer = performer;
        this.concertCapacity = concertCapacity;
    }
    
    public void fillList(Ticket ticket){
        tickets.add(ticket);
    }
    
    public String getPerformer(){
        return performer;
    }
    
    public void setPerformer(String performer){
        this.performer = performer;
    }
    
    public int getCapacity(){
        return concertCapacity;
    }
    
    public void setCapacity(int concertCapacity){
        this.concertCapacity = concertCapacity;
    }
    
    public List<Ticket> getTickets(){
        return tickets;
    }
    
    public void setTickets(List<Ticket> tickets){
        this.tickets = tickets;
    }
    
    public void printList(){
        System.out.println("Concert performed by: " + performer);
        for (Ticket ticket : tickets) {
            System.out.println(ticket.getTicketType().getPrice() + ", " + ticket.getTicketType());
        }
        System.out.println("Total sales: " + calcTotalSales());
    }
    
    public double calcTotalSales(){
        double sales = 0;
        for (Ticket ticket : tickets) {
            sales += ticket.getTicketType().getPrice();
        }
        return sales;
    }
    class Ticket {
    private ConcertTicket ticketType;
    
    public Ticket(ConcertTicket ticketType){
        this.ticketType = ticketType;
    }
    
    public ConcertTicket getTicketType(){
        return ticketType;
    }
}
}

