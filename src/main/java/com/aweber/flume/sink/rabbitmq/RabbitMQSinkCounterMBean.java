package com.aweber.flume.sink.rabbitmq;


public interface RabbitMQSinkCounterMBean {
    long getReceivedMessageCount();

    long getPublishedMessageCount();

    long getChannelExceptionCount();

    long getDeliveryExceptionCount();

    long getRabbitMQClosedCount();

    long getRabbitMQConnectedCount();

    long getRabbitMQSslExceptionCount();

    long getRabbitMQConnectionExceptionCount();

    long getCounterExceptionCount();

    long getAckCount();

    long getCounterRejectCount();

    long getStartTime();

    long getStopTime();

    String getType();
}
