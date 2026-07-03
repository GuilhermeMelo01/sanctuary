## CONCEPTS

### ``AWS WAF``
- AWS WAF (Web Application Firewall) is a fully managed AWS security service that {protects web applications and APIs
  from common exploits and bots} by filtering malicious traffic, allowing you to create {custom rules} based on
  IP addresses, headers, geo-location, and SQL injection/XSS patterns, integrating with services like {CloudFront, ALB, API Gateway}
  to act as a first line of defense against threats like DDoS and data breaches.

### ``Cognito``
- Amazon Cognito is a fully managed identity platform for web and mobile applications. It simplifies adding user
  sign-up, sign-in, and access control features, offering various authentication options like user pools, identity
  pools, and integrations with social and enterprise identity providers.

### ``AWS Auto Scaling``
- AWS Auto Scaling monitors your applications and automatically adjusts capacity to maintain steady, predictable performance at the lowest possible cost.

### ``Amazon Redshift Serverless``
- Easily run analytics workloads of any size without managing data warehouse infrastructure. Developers, data scientists,
  and data analysts can work across data warehouses and data lakes to build reporting and dashboarding applications,
  perform real-time analytics, collaborate on data, and build and train machine learning (ML) models.

### ``VPC Flow Logs``
- VPC Flow Logs is a feature that enables you to capture information about the IP traffic going to and from network interfaces in your VPC.

### ``Amazon VPC``
- Amazon Virtual Private Cloud (Amazon VPC) is a service that lets you launch AWS resources into a logically isolated virtual network that you define.
This virtual network resembles a traditional network in your own data center but benefits from the scalable infrastructure of AWS.

### ``Amazon Route 53``
- Amazon Route 53 provides highly available and scalable Domain Name System (DNS), domain name registration, and health-checking cloud services.

### ``Amazon Athena``
- Amazon Athena is a serverless query service that allows you to analyze data directly in Amazon S3 using standard SQL
  queries. You don't need to set up or manage any infrastructure; you only pay for the queries you run. It is
  well-suited for ad-hoc and exploratory analysis on data stored in S3 without the need for maintaining a separate
  database. 

### ``AMAZON EVENT BRIDGE``
- Amazon EventBridge is a serverless solution that makes it easy to connect application data from multiple sources without requiring additional code.

### ``AWS STEP FUNCTION``
- AWS Step Functions is a service that allows you to coordinate multiple AWS services into serverless workflows that can be triggered by events.

### ``AWS Health Dashboard``
- The AWS Health Dashboard provides a comprehensive view of the health of AWS services and your AWS resources. 
It includes notifications about service disruptions, upcoming maintenance, and other critical information about AWS services. While the dashboard itself does not directly provide RSS feeds, it is the primary tool for monitoring AWS service health and can be used to track issues and updates.

### ``AWS Cloud Adoption Framework``
- The AWS Cloud Adoption Framework (AWS CAF) leverages AWS experience and best practices to help you digitally transform
  and accelerate your business outcomes through innovative use of AWS.

- There're 4 phases: How it works
  - Envision : identify measurable business outcomes and prioritize transformation opportunities in line with your strategic objectives.
  - Align : Identify capability gaps and cross-organizational dependencies.
  - Launch : focus executing cloud migration, deliver pilots in production
  - Scale : optimizing and expanding cloud capabilities / expand pilots and business value

### ``Amazon Inspector``
- Amazon Inspector is an automated vulnerability management service that continually scans **Amazon Elastic Compute
  Cloud (EC2)**, AWS Lambda functions, and container workloads for software vulnerabilities and unintended network
  exposure.

### ``AWS Trusted Advisor``
- AWS Trusted Advisor is an Amazon Web Services (AWS) tool that inspects your AWS environment and provides real-time,
  actionable recommendations to optimize costs, improve security, enhance performance, and ensure high availability,
  all based on AWS best practices

### ``AWS WAF``
- AWS WAF is a web application firewall that helps protect web applications from attacks by allowing you to configure 
rules that allow, block, or monitor (count) web requests based on conditions that you define. These conditions include
IP addresses, HTTP headers, HTTP body, URI strings, SQL injection and cross-site scripting.

### ``AWS DIRECT CONNECTION``
- Private dedicated connection between on premises and AWS.

### ``AWS MANAGED SERVICES (AMS)``
- AWS Managed Services (AMS) helps you adopt AWS at scale and operate more efficiently and securely. We leverage
standard AWS services and offer operational guidance with specialized automations, skills,
and experience that are contextual to your environment and applications.

### ``AWS OUTPOSTS``
- Low-latency access to on-premises systems 
- Local data processing 
- Data residency 
- Easier migration from on-premises to the cloud
- Fully managed service

### ``CLOUD HSM``
- O AWS CloudHSM permite gerenciar e acessar as chaves em hardware validado pelos Padrões Federais de Processamento de Informações (FIPS), protegidas com instâncias HSM de locação única e de propriedade do cliente, executadas na sua própria nuvem privada virtual (VPC).

### ``AWS BATCH``
- O Batch é grupo de tarefas que devem ser executadas a mesmo tempo.
- Processamento em lote para treinamento, simulação e análise de modelos de ML em qualquer escala

### ``AWS LIGHTSAIL``
- Lightsail gets you started quickly with preconfigured Linux and Windows application stacks and an intuitive management console.

### ``AWS LAMBDA``
- O Amazon Web Services (AWS) Lambda é um serviço de computação que executa seu código em resposta a eventos e gerencia
  automaticamente os recursos computacionais para você, tornando mais fácil a implantação de aplicações que escalam
  individualmente em resposta a novas informações.

### ``Amazon Comprehend``
- O AWS Comprehend é utilizado para interpretar textos e frases.

### ``Amazon Lex``
- O Amazon Lex é utilizado para entender e transcrever o ASR para texto.

### ``Amazon Kendra``
- Amazon Kendra is an AWS service designed for building intelligent search capabilities into applications.
It supports natural language queries and allows you to search for text in documents stored in various sources,
including Amazon S3. Kendra is optimized for enterprise-scale data and can index and search across different 
types of content, making it suitable for searching text in documents.

### ``Amazon Textract``
- O Amazon Textract é utilizado para extrair imagens em arquivos JSON.

### ``Amazon Sagemaker``
- O Amazon Sagemaker é utilizado por DS/Developers para criar ML e A.I.

### ``Fargate``
- AWS Fargate is a serverless, pay-as-you-go compute engine for containers that works with Amazon Elastic Container Service (ECS) and Amazon Elastic Kubernetes Service (EKS). It allows you to run containers without managing the underlying virtual machines or clusters, as AWS handles server management, resource allocation, and scaling for you. You only pay for the CPU and memory resources your containers consume.

### ``Service Quotas``
- Service Quotas is an AWS service that allows users to view, manage, and request increases in service limits for various AWS services. Service limits are predefined limits set by AWS on the usage of specific resources or services within an AWS account.

### ``AWS Config``
- AWS service is used to track, record, and audit configuration changes made to AWS resources.

### ``AWS KMS``
- Use AWS KMS to encrypt data across your AWS workloads, digitally sign data, encrypt within your applications using
  AWS Encryption SDK, and generate and verify message authentication codes (MACs).

### ``Amazon EventBridge``
- allows you to set up event-driven workflows based on state changes of resources.

### ``AWS Storage Gateway``
- AWS Storage Gateway is a service that connects on-premises storage systems to AWS Cloud Storage Systems. It offers several deployment options, including an option that provides locally cached Cloud Storage.

### ``AWS Shield``
- AWS Shield is a managed distributed denial of service (DDoS) protection service that safeguards applications running on AWS.

### ``AWS APPLICATION MIGRATION SERVICE``
- AWS Application Migration Service Used for migrating servers and applications, not for transferring unstructured data.

### ``AWS MIGRATION HUB``
- AWS Migration Hub Tracks migration progress but does not handle the actual data transfer.

### ``AWS DATASYNC``
- Securely discover and migrate your data to AWS with end-to-end security, including data encryption and data integrity validation.

### ``Amazon Connect``
- Amazon Connect is a cloud-based customer contact center service offered by Amazon Web Services (AWS), 
enabling businesses to manage customer interactions through voice, chat, and email, all within a single platform.

### ``AWS Identity and Access Management Access Analyzer``
- AWS Identity and Access Management Access Analyzer - It helps identify and analyze resource access policies including those shared with other AWS accounts.

### ``IAM CREDENTIAL REPORT``
- You can generate and download a credential report that lists all users in your account and the status of their various credentials, including passwords, access keys, and MFA devices. You can get a credential report from the AWS Management Console, the AWS SDKs and Command Line Tools, or the IAM API.

### ``AWS CAF``
  - Operations Perspective Capabilities 
    - The Operations perspective in the AWS CAF focuses on managing and monitoring the performance and health of cloud resources and services
  - Observability
  - Event management (AIOps)
  - Incident and problem management
  - Change and release management
  - Performance and capacity management
  - Configuration management
  - Patch management
  - Availability and continuity management
  - Application management

### ``AWS LAMBDA``
- Compute service that runs your code in response to events and automatically manages the compute resources.

### ``AWS Application Composer``
- Helps you visually compose and configure AWS services into serverless applications backed by infrastructure as code

### ``Amazon QuickSight``
- Is the AWS service that gives users the ability to create interactive business intelligence (BI) dashboards that can
  include machine learning insights. It allows you to connect and visualize data from various sources, perform
  exploratory analysis and share information collaboratively in the form of reports and dashboards.

### ``AWS BACKUP``
- AWS Backup is a fully-managed service that makes it easy to centralize and automate data protection across AWS
  services, in the cloud, and on premises. Using this service, you can configure backup policies and monitor activity
  for your AWS resources in one place.

### ``Amazon GuardDuty``
- Amazon GuardDuty is a threat detection service that continuously monitors your AWS accounts and workloads for
  malicious activity and delivers detailed security findings for visibility and remediation.

### ``AWS ARTIFACT``
- AWS Artifact is a web service that enables you to download AWS security and compliance documents such as ISO certifications and SOC reports. User Guide. Describes key concepts of AWS Artifact and provides instructions for using the features of AWS Artifact.

### ``AWS Cost and Usage Report``
- Provides detailed data on AWS costs and usage, offering hourly or daily usage, costs, and resource-level details for
  in-depth analysis and auditing.

### ``AWS BUDGET``
- Using AWS Budgets, you can set a budget that alerts you when you exceed (or are forecasted to exceed) your budgeted
  cost or usage amount. You can also set alerts based on your RI or Savings Plans Utilization and Coverage using AWS
  Budgets.

### ``Amazon Macie``
- Amazon Macie is a data security service provided by Amazon Web Services (AWS) that uses machine learning and pattern
  matching to discover, classify, and protect sensitive data stored in S3 buckets

### ``Amazon S3``
- Amazon Simple Storage Service (Amazon S3) is an object storage service offering industry-leading scalability, data
  availability, security, and performance

### ``Elastic Compute Cloud``
- Amazon Elastic Compute Cloud (Amazon EC2) is a web service that provides secure, resizable compute capacity in the
  cloud. Amazon EC2 offers many options that help you build and run virtually any application. With these possibilities,
  getting started with EC2 is quick and easy to do.

### ``Indetity And Acess Management``
- Use AWS Identity and Access Management (IAM) to manage and scale workload and workforce access securely supporting
  your agility and innovation in AWS.

### ``Well-Architected Framework``
- The AWS Well-Architected Framework helps you understand the pros and cons of decisions you make while building systems
  on AWS. By using the Framework you will learn architectural best practices for designing and operating reliable,
  secure,
  efficient, cost-effective, and sustainable systems in the cloud.

- The pillars of the AWS Well-Architected Framework

|          Name          | Description                                                                                                                                                                                                                                                                                                                              |
|:----------------------:|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Operational excellence | The ability to support development and run workloads effectively, gain insight into their operations, and to continuously improve supporting processes and procedures to deliver business value.                                                                                                                                         |
|        Security        | The security pillar describes how to take advantage of cloud technologies to protect data, systems, and assets in a way that can improve your security posture.                                                                                                                                                                          |  
|      Reliability       | The reliability pillar encompasses the ability of a workload to perform its intended function correctly and consistently when it’s expected to. This includes the ability to operate and test the workload through its total lifecycle. This paper provides in-depth, best practice guidance for implementing reliable workloads on AWS. |
| Performance Efficiency | The ability to use computing resources efficiently to meet system requirements, and to maintain that efficiency as demand changes and technologies evolve.                                                                                                                                                                               |
|   Cost Optimization    | The ability to run systems to deliver business value at the lowest price point.                                                                                                                                                                                                                                                          |
|     Sustainability     | The ability to continually improve sustainability impacts by reducing energy consumption and increasing efficiency across all components of a workload by maximizing the benefits from the provisioned resources and minimizing the total resources required.                                                                            |

### ``Rekognition``
- Amazon Rekognition is a cloud-based image and video analysis service that makes it easy to add advanced computer
  vision capabilities to your applications.

### ``AWS Elastic Beanstalk``
- AWS Elastic Beanstalk is a PaaS (Platform-as-a-Service) that simplifies deploying and managing web applications and
  services on AWS. It automates tasks like resource provisioning, load balancing, and auto-scaling, allowing developers
  to focus on their code. Elastic Beanstalk utilizes AWS services like EC2, S3, and Elastic Load Balancing to create and
  manage the environment for your application.

### ``POLLY - AI Voice Generator``
- Amazon Polly is a fully-managed service that generates voice on demand, converting any text to
  an audio stream. Using deep learning technologies to convert articles, web pages, PDF documents,
  and other text-to-speech (TTS). Polly provides dozens of lifelike voices across a broad set of languages
  for you to build speech-activated applications that engage and convert. Meet diverse linguistic,
  accessibility, and learning needs of users across geographies and markets. Powerful neural networks
  and generative voice engines work in the background, synthesizing speech for you. Integrate the
  Amazon Polly API into your existing applications to become voice-ready quickly.

``LOOSE COUPLING``

- Loose coupling in software development refers to minimizing dependencies between different
  components or modules. This design approach aims to reduce the impact of changes in one component
  on others, leading to more flexible, maintainable, and testable code.

``RIGHT SIZING``

- Right sizing is the process of matching instance types and sizes to your workload performance
  and capacity requirements at the lowest possible cost.

``EC2 ALL UPFRONT``

- With the All Upfront option, you pay for the entire Reserved Instance term with one upfront payment.
  This option provides you with the largest discount compared to On-Demand Instance pricing.

``EC2 PARTIAL UPFRONT``

- With the Partial Upfront option, you make a low upfront payment and are then charged a discounted hourly
  rate for the instance for the duration of the Reserved Instance term. The No Upfront option does not
  require any upfront payment and provides a discounted hourly rate for the duration of the term.

``NAT gateway``

- NAT gateway allows instances in a private subnet to initiate **outbound** connections to the Internet,
  while preventing inbound connections.

``Amazon Neptune``
- Amazon Neptune is a managed graph database service provided by Amazon Web Services (AWS). It's designed to store and
  query billions of relationships with low latency. Neptune supports both property graphs (using Gremlin) and Resource
  Description Framework (RDF) data (using SPARQL). It's used in various applications like knowledge graphs,
  fraud detection, and recommendation engines.

``AWS CloudTrail``

- AWS CloudTrail is a service that enables governance, compliance, operational auditing, and security monitoring by
  logging and monitoring API calls made to every AWS resource in your account. It provides a record of every API call,
  including details about the user, account, and source IP address. This information can be used for auditing,
  troubleshooting, and security analysis.

``AWS CLOUDFORMATION``

- AWS CloudFormation is a service that allows users to model and manage AWS infrastructure resources in an automated and
  secure manner using Infrastructure as Code (IaC) principles. It enables users to define their desired infrastructure
  as templates, typically in JSON or YAML format, and then CloudFormation provisions and manages those resources.
  This approach promotes predictability, repeatability, and version control for infrastructure deployments.

``Amazon QuickSight``

- Amazon QuickSight is a cloud-based, serverless business intelligence service from Amazon Web Services (AWS) that
  allows users to create data visualizations and dashboards, enabling them to analyze data and gain insights quickly.

### Migrate databases

``Database Migration Service (DMS)``

- AWS Database Migration Service (AWS DMS) is a web service that you can use to migrate data from a source data store
  to a target data store

``AWS Schema Conversion Tool``

- You can use the AWS Schema Conversion Tool (AWS SCT) to convert your existing database schema from one database engine
  to another. 