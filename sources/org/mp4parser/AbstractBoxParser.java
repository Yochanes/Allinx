package org.mp4parser;

import java.nio.ByteBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBoxParser implements BoxParser {

    /* JADX INFO: renamed from: a */
    public static final Logger f58258a = LoggerFactory.getLogger(AbstractBoxParser.class.getName());

    /* JADX INFO: renamed from: org.mp4parser.AbstractBoxParser$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C64091 extends ThreadLocal<ByteBuffer> {
        @Override // java.lang.ThreadLocal
        public final ByteBuffer initialValue() {
            return ByteBuffer.allocate(32);
        }
    }
}
