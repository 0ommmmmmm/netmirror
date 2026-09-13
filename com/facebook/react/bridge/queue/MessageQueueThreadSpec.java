package com.facebook.react.bridge.queue;

import D2.h;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class MessageQueueThreadSpec {
    public static final long DEFAULT_STACK_SIZE_BYTES = 0;
    private final String name;
    private final long stackSize;
    private final ThreadType threadType;
    public static final Companion Companion = new Companion(null);
    private static final MessageQueueThreadSpec MAIN_UI_SPEC = new MessageQueueThreadSpec(ThreadType.MAIN_UI, "main_ui", 0, 4, null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MessageQueueThreadSpec mainThreadSpec() {
            return MessageQueueThreadSpec.MAIN_UI_SPEC;
        }

        public final MessageQueueThreadSpec newBackgroundThreadSpec(String str) {
            h.f(str, "name");
            return new MessageQueueThreadSpec(ThreadType.NEW_BACKGROUND, str, 0L, 4, null);
        }

        public final MessageQueueThreadSpec newUIBackgroundTreadSpec(String str) {
            h.f(str, "name");
            return new MessageQueueThreadSpec(ThreadType.NEW_BACKGROUND, str, 0L, 4, null);
        }

        private Companion() {
        }

        public final MessageQueueThreadSpec newBackgroundThreadSpec(String str, long j3) {
            h.f(str, "name");
            return new MessageQueueThreadSpec(ThreadType.NEW_BACKGROUND, str, j3, null);
        }
    }

    public enum ThreadType {
        MAIN_UI,
        NEW_BACKGROUND;

        private static final /* synthetic */ EnumEntries $ENTRIES = p091w2.a.a(values());

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ MessageQueueThreadSpec(ThreadType threadType, String str, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(threadType, str, j3);
    }

    public static final MessageQueueThreadSpec mainThreadSpec() {
        return Companion.mainThreadSpec();
    }

    public static final MessageQueueThreadSpec newBackgroundThreadSpec(String str) {
        return Companion.newBackgroundThreadSpec(str);
    }

    public static final MessageQueueThreadSpec newUIBackgroundTreadSpec(String str) {
        return Companion.newUIBackgroundTreadSpec(str);
    }

    public final String getName() {
        return this.name;
    }

    public final long getStackSize() {
        return this.stackSize;
    }

    public final ThreadType getThreadType() {
        return this.threadType;
    }

    private MessageQueueThreadSpec(ThreadType threadType, String str, long j3) {
        this.threadType = threadType;
        this.name = str;
        this.stackSize = j3;
    }

    public static final MessageQueueThreadSpec newBackgroundThreadSpec(String str, long j3) {
        return Companion.newBackgroundThreadSpec(str, j3);
    }

    /* synthetic */ MessageQueueThreadSpec(ThreadType threadType, String str, long j3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(threadType, str, (i3 & 4) != 0 ? 0L : j3);
    }
}
