package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import com.google.common.collect.Queues;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
abstract class Dispatcher {

    /* JADX INFO: compiled from: Proguard */
    public static final class ImmediateDispatcher extends Dispatcher {
        private static final ImmediateDispatcher INSTANCE = new ImmediateDispatcher();

        private ImmediateDispatcher() {
        }

        public static /* synthetic */ ImmediateDispatcher access$200() {
            return INSTANCE;
        }

        @Override // com.google.common.eventbus.Dispatcher
        public void dispatch(Object obj, Iterator<Subscriber> it) {
            Preconditions.checkNotNull(obj);
            while (it.hasNext()) {
                it.next().dispatchEvent(obj);
            }
        }
    }

    public static Dispatcher immediate() {
        return ImmediateDispatcher.access$200();
    }

    public static Dispatcher legacyAsync() {
        return new LegacyAsyncDispatcher(null);
    }

    public static Dispatcher perThreadDispatchQueue() {
        return new PerThreadQueuedDispatcher(null);
    }

    public abstract void dispatch(Object obj, Iterator<Subscriber> it);

    /* JADX INFO: compiled from: Proguard */
    public static final class LegacyAsyncDispatcher extends Dispatcher {
        private final ConcurrentLinkedQueue<EventWithSubscriber> queue;

        /* JADX INFO: compiled from: Proguard */
        public static final class EventWithSubscriber {
            private final Object event;
            private final Subscriber subscriber;

            public /* synthetic */ EventWithSubscriber(Object obj, Subscriber subscriber, C43791 c43791) {
                this(obj, subscriber);
            }

            public static /* synthetic */ Object access$700(EventWithSubscriber eventWithSubscriber) {
                return eventWithSubscriber.event;
            }

            public static /* synthetic */ Subscriber access$800(EventWithSubscriber eventWithSubscriber) {
                return eventWithSubscriber.subscriber;
            }

            private EventWithSubscriber(Object obj, Subscriber subscriber) {
                this.event = obj;
                this.subscriber = subscriber;
            }
        }

        private LegacyAsyncDispatcher() {
            this.queue = Queues.newConcurrentLinkedQueue();
        }

        @Override // com.google.common.eventbus.Dispatcher
        public void dispatch(Object obj, Iterator<Subscriber> it) {
            Preconditions.checkNotNull(obj);
            while (it.hasNext()) {
                this.queue.add(new EventWithSubscriber(obj, it.next(), null));
            }
            while (true) {
                EventWithSubscriber eventWithSubscriberPoll = this.queue.poll();
                if (eventWithSubscriberPoll == null) {
                    return;
                } else {
                    EventWithSubscriber.access$800(eventWithSubscriberPoll).dispatchEvent(EventWithSubscriber.access$700(eventWithSubscriberPoll));
                }
            }
        }

        public /* synthetic */ LegacyAsyncDispatcher(C43791 c43791) {
            this();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PerThreadQueuedDispatcher extends Dispatcher {
        private final ThreadLocal<Boolean> dispatching;
        private final ThreadLocal<Queue<Event>> queue;

        /* JADX INFO: renamed from: com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C43801 extends ThreadLocal<Queue<Event>> {
            public C43801() {
            }

            @Override // java.lang.ThreadLocal
            public /* bridge */ /* synthetic */ Queue<Event> initialValue() {
                return initialValue2();
            }

            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: initialValue, reason: avoid collision after fix types in other method */
            public Queue<Event> initialValue2() {
                return Queues.newArrayDeque();
            }
        }

        /* JADX INFO: renamed from: com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$2 */
        /* JADX INFO: compiled from: Proguard */
        public class C43812 extends ThreadLocal<Boolean> {
            public C43812() {
            }

            @Override // java.lang.ThreadLocal
            public /* bridge */ /* synthetic */ Boolean initialValue() {
                return initialValue();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            public Boolean initialValue() {
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Event {
            private final Object event;
            private final Iterator<Subscriber> subscribers;

            public /* synthetic */ Event(Object obj, Iterator it, C43791 c43791) {
                this(obj, it);
            }

            public static /* synthetic */ Iterator access$400(Event event) {
                return event.subscribers;
            }

            public static /* synthetic */ Object access$500(Event event) {
                return event.event;
            }

            private Event(Object obj, Iterator<Subscriber> it) {
                this.event = obj;
                this.subscribers = it;
            }
        }

        private PerThreadQueuedDispatcher() {
            this.queue = new C43801();
            this.dispatching = new C43812();
        }

        @Override // com.google.common.eventbus.Dispatcher
        public void dispatch(Object obj, Iterator<Subscriber> it) {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(it);
            Queue<Event> queue = this.queue.get();
            Objects.requireNonNull(queue);
            Queue<Event> queue2 = queue;
            queue2.offer(new Event(obj, it, null));
            if (this.dispatching.get().booleanValue()) {
                return;
            }
            this.dispatching.set(Boolean.TRUE);
            while (true) {
                try {
                    Event eventPoll = queue2.poll();
                    if (eventPoll == null) {
                        return;
                    }
                    while (Event.access$400(eventPoll).hasNext()) {
                        ((Subscriber) Event.access$400(eventPoll).next()).dispatchEvent(Event.access$500(eventPoll));
                    }
                } finally {
                    this.dispatching.remove();
                    this.queue.remove();
                }
            }
        }

        public /* synthetic */ PerThreadQueuedDispatcher(C43791 c43791) {
            this();
        }
    }
}
