package com.aweber.flume.sink.rabbitmq;

import org.apache.commons.lang.ArrayUtils;
import org.apache.flume.instrumentation.MonitoredCounterGroup;

public class RabbitMQSinkCounter extends MonitoredCounterGroup implements RabbitMQSinkCounterMBean {

    private static final String COUNTER_CONNECTION_CREATED =
            "sink.connection.creation.count";

    private static final String COUNTER_CONNECTION_CLOSED =
            "sink.connection.closed.count";

    private static final String COUNTER_CONNECTION_FAILED =
            "sink.connection.failed.count";

    private static final String COUNTER_BATCH_EMPTY =
            "sink.batch.empty";

    private static final String COUNTER_BATCH_UNDERFLOW =
            "sink.batch.underflow";

    private static final String COUNTER_BATCH_COMPLETE =
            "sink.batch.complete";

    private static final String COUNTER_EVENT_DRAIN_ATTEMPT =
            "sink.event.drain.attempt";

    private static final String COUNTER_EVENT_DRAIN_SUCCESS =
            "sink.event.drain.sucess";

    private static final String COUNTER_RECEIVED_MESSAGE =          "sink.message.received";
    private static final String COUNTER_PUBLISHED_MESSAGE =         "sink.message.published";
    private static final String COUNTER_EMPTY_MESSAGE =             "sink.message.empty";
    private static final String COUNTER_CHANNEL_EXCEPTION =         "sink.exception.channel";
    private static final String COUNTER_DELIVERY_EXCEPTION =        "sink.exception.delivery";
    private static final String COUNTER_RABBITMQ_CLOSED =           "sink.rabbitmq.closed";
    private static final String COUNTER_RABBITMQ_CONNECTED =        "sink.rabbitmq.connected";
    private static final String COUNTER_RABBITMQ_SSL_EXCEPTION =    "sink.rabbitmq.exception.ssl";
    private static final String COUNTER_RABBITMQ_CONNECTION_EXCEPTION = "sink.rabbitmq.exception.connection";
    private static final String COUNTER_ACK = "rabbitmq.ack";
    private static final String COUNTER_EXCEPTION = "rabbitmq.exception";
    private static final String COUNTER_REJECT = "rabbitmq.reject";


    private static final String[] ATTRIBUTES = {
            COUNTER_CONNECTION_CREATED, COUNTER_CONNECTION_CLOSED,
            COUNTER_CONNECTION_FAILED, COUNTER_BATCH_EMPTY,
            COUNTER_BATCH_UNDERFLOW, COUNTER_BATCH_COMPLETE,
            COUNTER_EVENT_DRAIN_ATTEMPT, COUNTER_EVENT_DRAIN_SUCCESS,
            COUNTER_RECEIVED_MESSAGE, COUNTER_PUBLISHED_MESSAGE,
            COUNTER_CHANNEL_EXCEPTION, COUNTER_DELIVERY_EXCEPTION,
            COUNTER_RABBITMQ_CLOSED, COUNTER_RABBITMQ_CONNECTED,
            COUNTER_RABBITMQ_SSL_EXCEPTION, COUNTER_RABBITMQ_CONNECTION_EXCEPTION
    };


    public RabbitMQSinkCounter(String name) {
        super(MonitoredCounterGroup.Type.SINK, name, ATTRIBUTES);
    }

    public RabbitMQSinkCounter(String name, String[] attributes) {
        super(MonitoredCounterGroup.Type.SINK, name,
                (String[]) ArrayUtils.addAll(attributes, ATTRIBUTES));
    }


    @Override
    public long getConnectionCreatedCount() {
        return get(COUNTER_CONNECTION_CREATED);
    }

    public long incrementConnectionCreatedCount() {
        return increment(COUNTER_CONNECTION_CREATED);
    }

    @Override
    public long getConnectionClosedCount() {
        return get(COUNTER_CONNECTION_CLOSED);
    }

    public long incrementConnectionClosedCount() {
        return increment(COUNTER_CONNECTION_CLOSED);
    }

    @Override
    public long getConnectionFailedCount() {
        return get(COUNTER_CONNECTION_FAILED);
    }

    public long incrementConnectionFailedCount() {
        return increment(COUNTER_CONNECTION_FAILED);
    }

    @Override
    public long getBatchEmptyCount() {
        return get(COUNTER_BATCH_EMPTY);
    }

    public long incrementBatchEmptyCount() {
        return increment(COUNTER_BATCH_EMPTY);
    }

    @Override
    public long getBatchUnderflowCount() {
        return get(COUNTER_BATCH_UNDERFLOW);
    }

    public long incrementBatchUnderflowCount() {
        return increment(COUNTER_BATCH_UNDERFLOW);
    }

    @Override
    public long getBatchCompleteCount() {
        return get(COUNTER_BATCH_COMPLETE);
    }

    public long incrementBatchCompleteCount() {
        return increment(COUNTER_BATCH_COMPLETE);
    }

    @Override
    public long getEventDrainAttemptCount() {
        return get(COUNTER_EVENT_DRAIN_ATTEMPT);
    }

    public long incrementEventDrainAttemptCount() {
        return increment(COUNTER_EVENT_DRAIN_ATTEMPT);
    }

    public long addToEventDrainAttemptCount(long delta) {
        return addAndGet(COUNTER_EVENT_DRAIN_ATTEMPT, delta);
    }

    @Override
    public long getEventDrainSuccessCount() {
        return get(COUNTER_EVENT_DRAIN_SUCCESS);
    }

    public long incrementEventDrainSuccessCount() {
        return increment(COUNTER_EVENT_DRAIN_SUCCESS);
    }

    public long addToEventDrainSuccessCount(long delta) {
        return addAndGet(COUNTER_EVENT_DRAIN_SUCCESS, delta);
    }

    public long getReceivedMessageCount(){
        return get(COUNTER_RECEIVED_MESSAGE);
    }

    public long incrementReceivedMessageCount(){
        return increment(COUNTER_RECEIVED_MESSAGE);
    }

    public long getMessagePublishedCount(){
        return get(COUNTER_PUBLISHED_MESSAGE);
    }

    public long incrementMessagePublishedCount(){
        return increment(COUNTER_PUBLISHED_MESSAGE);
    }

    public long getMessageEmptyCount(){
        return get(COUNTER_EMPTY_MESSAGE);
    }

    public long incrementEmptyMessageCount(){
        return increment(COUNTER_EMPTY_MESSAGE);
    }

    public long getChannelExceptionCount(){
        return get(COUNTER_CHANNEL_EXCEPTION);
    }

    public long incrementChannelExceptionCount(){
        return increment(COUNTER_EMPTY_MESSAGE);
    }

    public long getDeliveryExceptionCount(){
        return get(COUNTER_DELIVERY_EXCEPTION);
    }

    public long incrementDeliveryExceptionCount(){
        return increment(COUNTER_DELIVERY_EXCEPTION);
    }

    public long getRabbitMQClosedCount(){
        return get(COUNTER_RABBITMQ_CLOSED);
    }

    public long incrementRabbitMQClosedCount(){
        return increment(COUNTER_RABBITMQ_CLOSED);
    }

    public long getRabbitMQConnectedCount(){
        return get(COUNTER_RABBITMQ_CONNECTED);
    }

    public long incrementRabbitMQConnectedCount(){
        return increment(COUNTER_RABBITMQ_CONNECTED);
    }

    public long getRabbitMQSslExceptionCount(){
        return get(COUNTER_RABBITMQ_SSL_EXCEPTION);
    }

    public long incrementRabbitMQSslExceptionCount(){
        return increment(COUNTER_RABBITMQ_SSL_EXCEPTION);
    }

    public long getRabbitMQConnectionExceptionCount(){
        return get(COUNTER_RABBITMQ_CONNECTION_EXCEPTION);
    }

    public long incrementRabbitMQConnectionExceptionCount(){
        return increment(COUNTER_RABBITMQ_CONNECTION_EXCEPTION);
    }

    public long getAckCount(){
        return get(COUNTER_ACK);
    }

    public long incrementAckCount(){
        return increment(COUNTER_ACK);
    }

    public long getCounterExceptionCount(){
        return get(COUNTER_EXCEPTION);
    }

    public long incrementCounterExceptionCount(){
        return increment(COUNTER_EXCEPTION);
    }

    public long getCounterRejectCount(){
        return get(COUNTER_REJECT);
    }

    public long incrementCounterRejectCount(){
        return increment(COUNTER_REJECT);
    }
}
