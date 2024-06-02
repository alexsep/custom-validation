### How to create a custom annotation to validate a class attributes
This is a simple example of how to develop a custom annotation to validate a DTO.

Just for study purposes, let's assume we have the following scenario:

In this project we have a `CarDto` class and depending on the `Category` 
it's necessary to validate the information present in the `List<ExtraInformation> extraInformation`. For instance if the category
is SPORTS the extra information must have an item of the type `HORSE_POWER`.

