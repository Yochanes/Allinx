package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class CycleDetector {

    /* JADX INFO: compiled from: Proguard */
    public static class ComponentNode {
        private final Component<?> component;
        private final Set<ComponentNode> dependencies = new HashSet();
        private final Set<ComponentNode> dependents = new HashSet();

        public ComponentNode(Component<?> component) {
            this.component = component;
        }

        public void addDependency(ComponentNode componentNode) {
            this.dependencies.add(componentNode);
        }

        public void addDependent(ComponentNode componentNode) {
            this.dependents.add(componentNode);
        }

        public Component<?> getComponent() {
            return this.component;
        }

        public Set<ComponentNode> getDependencies() {
            return this.dependencies;
        }

        public boolean isLeaf() {
            return this.dependencies.isEmpty();
        }

        public boolean isRoot() {
            return this.dependents.isEmpty();
        }

        public void removeDependent(ComponentNode componentNode) {
            this.dependents.remove(componentNode);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Dep {
        private final Qualified<?> anInterface;
        private final boolean set;

        public /* synthetic */ Dep(Qualified qualified, boolean z2, C46051 c46051) {
            this(qualified, z2);
        }

        public static /* synthetic */ boolean access$100(Dep dep) {
            return dep.set;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Dep) {
                Dep dep = (Dep) obj;
                if (dep.anInterface.equals(this.anInterface) && dep.set == this.set) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.anInterface.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.set).hashCode();
        }

        private Dep(Qualified<?> qualified, boolean z2) {
            this.anInterface = qualified;
            this.set = z2;
        }
    }

    public static void detect(List<Component<?>> list) {
        Set<ComponentNode> graph = toGraph(list);
        Set<ComponentNode> roots = getRoots(graph);
        int i = 0;
        while (!roots.isEmpty()) {
            ComponentNode next = roots.iterator().next();
            roots.remove(next);
            i++;
            for (ComponentNode componentNode : next.getDependencies()) {
                componentNode.removeDependent(next);
                if (componentNode.isRoot()) {
                    roots.add(componentNode);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ComponentNode componentNode2 : graph) {
            if (!componentNode2.isRoot() && !componentNode2.isLeaf()) {
                arrayList.add(componentNode2.getComponent());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set<ComponentNode> getRoots(Set<ComponentNode> set) {
        HashSet hashSet = new HashSet();
        for (ComponentNode componentNode : set) {
            if (componentNode.isRoot()) {
                hashSet.add(componentNode);
            }
        }
        return hashSet;
    }

    private static Set<ComponentNode> toGraph(List<Component<?>> list) {
        Set<ComponentNode> set;
        HashMap map = new HashMap(list.size());
        for (Component<?> component : list) {
            ComponentNode componentNode = new ComponentNode(component);
            for (Qualified<? super Object> qualified : component.getProvidedInterfaces()) {
                Dep dep = new Dep(qualified, !component.isValue(), null);
                if (!map.containsKey(dep)) {
                    map.put(dep, new HashSet());
                }
                Set set2 = (Set) map.get(dep);
                if (!set2.isEmpty() && !Dep.access$100(dep)) {
                    throw new IllegalArgumentException("Multiple components provide " + qualified + ".");
                }
                set2.add(componentNode);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (ComponentNode componentNode2 : (Set) it.next()) {
                for (Dependency dependency : componentNode2.getComponent().getDependencies()) {
                    if (dependency.isDirectInjection() && (set = (Set) map.get(new Dep(dependency.getInterface(), dependency.isSet(), null))) != null) {
                        for (ComponentNode componentNode3 : set) {
                            componentNode2.addDependency(componentNode3);
                            componentNode3.addDependent(componentNode2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        return hashSet;
    }
}
