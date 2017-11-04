# Animal Indexer

A java application using Apache Lucene for Information Retrieval purposes.

---

# Java Class Part

To create the relative Java Classes that represent the following scenario contemplating the following classes.

## General for all animals

Every Animal has:

1. Age
1. Name
1. Description (keep it from Wikipedia)  
1. Specialized version of the feedMe( ... ) that performs different kind of digestion

## Herbivores

- Herbivorous animals are vegetarians meaning that they **only eat** plants. 
- Many animals are unable to eat large amounts of vegetation as their digestive systems are unable to break it down. 
- Herbivorous animals have evolved to be able to consume and digest large quantities of plants, many of which have more than one stomach. 

### Examples of herbivores

1. Elephants
1. Rabbits
1. Manatees
1. Deer.

## Omnivores

- Animals that are said to be omnivorous, are animals that eat pretty much anything. 
- An omnivorous diet is made up of both plant matter and other animals.
- As lots of animals need to eat a high amount of protein which other animals contain. 

### Examples of omnivores

1. Humans
1. Bears
1. Lemurs
1. Raccoons
1. Numerous birds

## Carnivores

- Carnivorous animals are meat-eaters, meaning that they only eat other animals in order to get their nutrition. 
- Carnivores usually have sharp teeth and strong jaws, which they need to successfully catch and eat their prey. 

### Examples of carnivores

1. Lions
1. Crocodiles
1. Sharks
1. Otters
1. Weasels

## Other requirements

Prepare also the main method with an instance for every kind of each Animal and invoke the feedMe method for each one.

# Indexing with Lucene

Using Lucene create a full IR system that allows to search animals by:

1. Diet
1. Name
1. Description

### Lucene

[Apache Lucene](https://lucene.apache.org/core/) is a high-performance, full-featured text search engine library written entirely in Java. It is a technology suitable for nearly any application that requires full-text search, especially cross-platform.

# About

Homework #1 for the Social and behavioral Networks course from the [Laura Magistrale in Data Science](http://datascience.i3s.uniroma1.it/it) program at [Sapienza - Università di Roma](https://www.uniroma1.it/it/). 
