package com.concurrency.threadfactory;

import java.util.concurrent.TimeUnit;

/**
 * @author Sophia Klocheva
 * on 02/12/2020
 */
public class Task implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            TimeUnit.SECONDS.sleep(2);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
