package com.tinder.scarlet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/tinder/scarlet/Message;", "", "Bytes", "Text", "Lcom/tinder/scarlet/Message$Text;", "Lcom/tinder/scarlet/Message$Bytes;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class Message {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/Message$Bytes;", "Lcom/tinder/scarlet/Message;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Bytes extends Message {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/Message$Text;", "Lcom/tinder/scarlet/Message;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final /* data */ class Text extends Message {

        /* JADX INFO: renamed from: a */
        public final String f43452a;

        public Text(String str) {
            this.f43452a = str;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Text) && Intrinsics.m18594b(this.f43452a, ((Text) obj).f43452a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f43452a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return AbstractC0000a.m19p(new StringBuilder("Text(value="), this.f43452a, ")");
        }
    }
}
