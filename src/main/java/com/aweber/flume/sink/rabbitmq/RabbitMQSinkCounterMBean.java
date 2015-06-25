package com.aweber.flume.sink.rabbitmq;


public interface RabbitMQSinkCounterMBean {
    long getConnectionCreatedCount();

    long getConnectionClosedCount();

    long getConnectionFailedCount();

    long getBatchEmptyCount();

    long getBatchUnderflowCount();

    long getBatchCompleteCount();

    long getEventDrainAttemptCount();

    long getEventDrainSuccessCount();

    long getReceivedMessageCount();

    long getMessagePublishedCount();

    long getMessageEmptyCount();

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
