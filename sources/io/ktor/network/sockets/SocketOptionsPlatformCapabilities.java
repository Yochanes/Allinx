package io.ktor.network.sockets;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.SocketOption;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/sockets/SocketOptionsPlatformCapabilities;", "", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class SocketOptionsPlatformCapabilities {

    /* JADX INFO: renamed from: a */
    public static final Object f46106a;

    static {
        Map mapM18481d;
        try {
            Field[] fields = Class.forName("java.net.StandardSocketOptions").getFields();
            if (fields != null) {
                ArrayList arrayList = new ArrayList();
                for (Field it : fields) {
                    Intrinsics.m18598f(it, "it");
                    int modifiers = it.getModifiers();
                    if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers) && Modifier.isPublic(modifiers)) {
                        arrayList.add(it);
                    }
                }
                int iM18484g = MapsKt.m18484g(CollectionsKt.m18452r(arrayList, 10));
                if (iM18484g < 16) {
                    iM18484g = 16;
                }
                mapM18481d = new LinkedHashMap(iM18484g);
                for (Object obj : arrayList) {
                    Field it2 = (Field) obj;
                    Intrinsics.m18598f(it2, "it");
                    String name = it2.getName();
                    Intrinsics.m18598f(name, "it.name");
                    mapM18481d.put(name, obj);
                }
            } else {
                mapM18481d = MapsKt.m18481d();
            }
        } catch (Throwable unused) {
            mapM18481d = MapsKt.m18481d();
        }
        f46106a = mapM18481d;
        try {
            Class<?> cls = Class.forName("java.nio.channels.SocketChannel");
            Method[] methods = cls.getMethods();
            Intrinsics.m18598f(methods, "socketChannelClass.methods");
            for (Method method : methods) {
                Intrinsics.m18598f(method, "method");
                int modifiers2 = method.getModifiers();
                if (!Modifier.isPublic(modifiers2) || Modifier.isStatic(modifiers2) || !Intrinsics.m18594b(method.getName(), "setOption") || method.getParameterTypes().length != 2 || !Intrinsics.m18594b(method.getReturnType(), cls) || !Intrinsics.m18594b(method.getParameterTypes()[0], SocketOption.class) || !Intrinsics.m18594b(method.getParameterTypes()[1], Object.class)) {
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            Class<?> cls2 = Class.forName("java.nio.channels.ServerSocketChannel");
            Method[] methods2 = cls2.getMethods();
            Intrinsics.m18598f(methods2, "socketChannelClass.methods");
            for (Method method2 : methods2) {
                Intrinsics.m18598f(method2, "method");
                int modifiers3 = method2.getModifiers();
                if (!Modifier.isPublic(modifiers3) || Modifier.isStatic(modifiers3) || !Intrinsics.m18594b(method2.getName(), "setOption") || method2.getParameterTypes().length != 2 || !Intrinsics.m18594b(method2.getReturnType(), cls2) || !Intrinsics.m18594b(method2.getParameterTypes()[0], SocketOption.class) || !Intrinsics.m18594b(method2.getParameterTypes()[1], Object.class)) {
                }
            }
        } catch (Throwable unused3) {
        }
        try {
            Class<?> cls3 = Class.forName("java.nio.channels.DatagramChannel");
            Method[] methods3 = cls3.getMethods();
            Intrinsics.m18598f(methods3, "socketChannelClass.methods");
            for (Method method3 : methods3) {
                Intrinsics.m18598f(method3, "method");
                int modifiers4 = method3.getModifiers();
                if (Modifier.isPublic(modifiers4) && !Modifier.isStatic(modifiers4) && Intrinsics.m18594b(method3.getName(), "setOption") && method3.getParameterTypes().length == 2 && Intrinsics.m18594b(method3.getReturnType(), cls3) && Intrinsics.m18594b(method3.getParameterTypes()[0], SocketOption.class) && Intrinsics.m18594b(method3.getParameterTypes()[1], Object.class)) {
                    return;
                }
            }
        } catch (Throwable unused4) {
        }
    }
}
