GGC_CORE_PATH=./ggc-core
GGC_APP_PATH=./ggc-app
PO_UILIB_PATH=./po-uilib

CLASSPATH=$(shell pwd)/po-uilib/po-uilib.jar:$(shell pwd)/ggc-app/ggc-app.jar:$(shell pwd)/ggc-core/ggc-core.jar

all:
	$(MAKE) -C $(PO_UILIB_PATH)
	$(MAKE) -C $(GGC_CORE_PATH)
	$(MAKE) -C $(GGC_APP_PATH)
	CLASSPATH=$(CLASSPATH) java ggc.app.App

clean:
	$(MAKE) -C $(GGC_CORE_PATH) clean
	$(MAKE) -C $(GGC_APP_PATH) clean
	$(MAKE) -C $(PO_UILIB_PATH) clean
	rm -f ggc.app.App
