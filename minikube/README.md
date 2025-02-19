## Steps

1. Start minikube

```
minikube start --cpus='max' --memory=20480 --driver=docker \
  --addons=metrics-server --kubernetes-version=v1.25.3
```

2. Deploy Strimzi

```
kubectl create -f kafka/manifests/strimzi-cluster-operator-0.39.0.yaml
```

```
kubectl get deploy,rs,po
```


3. Start kafka

```
kubectl create -f kafka/manifests/kafka-cluster.yaml
```

```
kubectl get po,strimzipodsets.core.strimzi.io,svc -l app.kubernetes.io/instance=demo-cluster
```


4. Start kafka-ui

```
kubectl create -f kafka/manifests/kafka-ui.yaml
```

```
kubectl get all -l app=kafka-ui
```
