package com.google.gson.internal.sql;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class SqlTypesSupport {
    public static final DefaultDateTypeAdapter.DateType<? extends Date> DATE_DATE_TYPE;
    public static final TypeAdapterFactory DATE_FACTORY;
    public static final boolean SUPPORTS_SQL_TYPES;
    public static final DefaultDateTypeAdapter.DateType<? extends Date> TIMESTAMP_DATE_TYPE;
    public static final TypeAdapterFactory TIMESTAMP_FACTORY;
    public static final TypeAdapterFactory TIME_FACTORY;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.SqlTypesSupport$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C48681 extends DefaultDateTypeAdapter.DateType<java.sql.Date> {
        public C48681(Class cls) {
            super(cls);
        }

        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
        public /* bridge */ /* synthetic */ Date deserialize(Date date) {
            return deserialize(date);
        }

        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
        public java.sql.Date deserialize(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.sql.SqlTypesSupport$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C48692 extends DefaultDateTypeAdapter.DateType<Timestamp> {
        public C48692(Class cls) {
            super(cls);
        }

        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
        public /* bridge */ /* synthetic */ Date deserialize(Date date) {
            return deserialize(date);
        }

        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
        public Timestamp deserialize(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z2;
        try {
            Class.forName("java.sql.Date");
            z2 = true;
        } catch (ClassNotFoundException unused) {
            z2 = false;
        }
        SUPPORTS_SQL_TYPES = z2;
        if (z2) {
            DATE_DATE_TYPE = new C48681(java.sql.Date.class);
            TIMESTAMP_DATE_TYPE = new C48692(Timestamp.class);
            DATE_FACTORY = SqlDateTypeAdapter.FACTORY;
            TIME_FACTORY = SqlTimeTypeAdapter.FACTORY;
            TIMESTAMP_FACTORY = SqlTimestampTypeAdapter.FACTORY;
            return;
        }
        DATE_DATE_TYPE = null;
        TIMESTAMP_DATE_TYPE = null;
        DATE_FACTORY = null;
        TIME_FACTORY = null;
        TIMESTAMP_FACTORY = null;
    }

    private SqlTypesSupport() {
    }
}
