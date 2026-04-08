package kotlin.reflect;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/reflect/KClass;", "", "T", "Lkotlin/reflect/KDeclarationContainer;", "Lkotlin/reflect/KAnnotatedElement;", "Lkotlin/reflect/KClassifier;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public interface KClass<T> extends KDeclarationContainer, KAnnotatedElement, KClassifier {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    List mo18586a();

    /* JADX INFO: renamed from: c */
    String mo18587c();

    int hashCode();

    /* JADX INFO: renamed from: i */
    String mo18588i();

    /* JADX INFO: renamed from: m */
    boolean mo18589m(Object obj);
}
