# MoshiKotlinExample

Example project on how to leverage Kotlin for better JSON parsing using [Moshi][moshi].
This repo is the side product of a talk presented at Berlin Kotlin Meetup and Berlin Android Meetup.
The plan is to add more examples and tips on parsing JSON with Moshi into Kotlin classes.

## Structure

Currently this repo serves as an example project on how to enforce nullability, 
 make use of default constructor values and a few more features Kotlin provides and how to use them in your models.
For a better understanding of the code the slides and especially the blog post linked below should help.

Basic structure briefly explained:

- main/MoshiBuilder - singleton that provides an instance of `Moshi` with all its parsing adapters 
- main/adapter/ - a package with helpful MoshiAdapters
- main/model/ - example models to showcase what is possible

The project also contains tests to showcase the general functionality.
Playing around with the adapters while having a look on the tests 
 is probably the best way to get a feeling of what this repo is all about ;)

## Links

- [Blog Post][blog_post] 
- [Slides][slides]

## Author

* [Stefan Medack][stefan]

## License

    Copyright 2017 Stefan Medack

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[moshi]: https://github.com/square/moshi/
[blog_post]: https://engineering.kitchenstories.io/data-classes-and-parsing-json-a-story-about-converting-models-to-kotlin-caf8a599df9e
[slides]: https://speakerdeck.com/zonic03/data-classes-and-parsing-json-a-story-about-converting-models-to-kotlin
[stefan]: https://twitter.com/Zonic03