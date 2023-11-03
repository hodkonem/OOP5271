package newmarket.objects;

import lessonactor.objects.Actor;
import newmarket.interfaces.MarketBehaviour;
import newmarket.interfaces.QueueBehaviour;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    private List<Actor> queueList;
    private List<Actor> marketList;

    public Market() {
        queueList = new ArrayList<>();
        marketList = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        queueList.remove(actor);
        marketList.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        marketList.removeAll(actors);
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queueList.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : marketList) {
            // логика принятия заказов
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : marketList) {
            // логика отдачи заказов
        }
    }

    @Override
    public void releaseFromQueue() {
        queueList.remove(0);
    }

    public List<Actor> getQueueList() {
        return queueList;
    }

    public List<Actor> getMarketList() {
        return marketList;
    }
}