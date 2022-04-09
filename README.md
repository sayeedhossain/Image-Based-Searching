Uses :
Reverse image search may be used to:

Locate the source of an image.
Find higher resolution versions.
Discover webpages where the image appears.
Find the content creator.
Get information about an image.

-----------------------------------------------------------------------------------------------------------------------------

Application in popular search systems
Google Images
Google's Search by image is a feature that uses reverse image search and allows users to search for related images just by uploading an image or image URL. Google accomplishes this by analyzing the submitted picture and constructing a mathematical model of it using advanced algorithms. It is then compared with billions of other images in Google's databases before returning matching and similar results. It should be noted that, when available, Google also uses metadata about the image such as description.

TinEye
TinEye is a search engine specialized for reverse image search. Upon submitting an image, TinEye creates a "unique and compact digital signature or fingerprint" of said image and matches it with other indexed images. This procedure is able to match even very edited versions of the submitted image, but will not usually return similar images in the results.

eBay
eBay ShopBot uses reverse image search to find products by a user uploaded photo. eBay uses a ResNet-50 network for category recognition, image hashes are stored in Google Bigtable; Apache Spark jobs are operated by Google Cloud Dataproc for image hash extraction; and the image ranking service is deployed by Kubernetes. 

SK Planet
SK Planet uses reverse image search to find related fashion items on its e-commerce website. It developed the vision encoder network based on the TensorFlow inception-v3, with speed of convergence and generalization for production usage. A recurrent neural network is used for multi-class classification, and fashion-product region-of interest detection is based on Faster R-CNN. SK Planet's reverse image search system is built in less than 100 man-months.

Alibaba
Alibaba released the Pailitao application during 2014. Pailitao (Chinese: 拍立淘, literally means shopping through a camera) allows users to search for items on Alibaba's E-commercial platform by taking a photo of the query object. The Pailitao application uses a deep CNN model with branches for joint detection and feature learning to discover the detection mask and exact discriminative feature without background disturbance. GoogLeNet V1 is employed as the base model for category prediction and feature learning.

Pinterest
Pinterest acquired startup company VisualGraph in 2014 and introduced visual search on its platform. In 2015, Pinterest published a paper at the ACM Conference on Knowledge Discovery and Data Mining conference and disclosed the architecture of the system. The pipeline uses Apache Hadoop, the open-source Caffe convolutional neural network framework, Cascading for batch processing, PinLater for messaging, and Apache HBase for storage. Image characteristics, including local features, deep features, salient color signatures and salient pixels are extracted from user uploads. The system is operated by Amazon EC2, and only requires a cluster of 5 GPU instances to handle daily image uploads onto Pinterest. By using reverse image search, Pinterest is able to extract visual features from fashion objects (e.g. shoes, dress, glasses, bag, watch, pants, shorts, bikini, earrings) and offer product recommendations that look similar.

Research systems
Microsoft Research Asia's Beijing Lab published a paper in the Proceedings of the IEEE on the Arista-SS (Similar Search) and the Arista-DS (Duplicate Search) systems. Arista-DS only performs duplicate search algorithms such as principal component analysis on global image features to lower computational and memory costs. Arista-DS is able to perform duplicate search on 2 billion images with 10 servers but with the trade-off of not detecting near duplicates.[15]

-----------------------------------------------------------------------------------------------------------------------------

<h4>Any further query? just feel free to contact at (me@sayeedhossain.com) </h4>
