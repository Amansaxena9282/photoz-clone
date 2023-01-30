package com.jetbrains.marco.photoz.clone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotozController {
//    private Map<String, photo> db= Collections.unmodifiableMap(new HashMap<>() {
//        {
//            String id;
//            put("1", new Photo(id:"1", fileName:"hello.jpg"));
//
//        }
//
//    });
    @GetMapping ("/")
    public String hello(){
        return "hello aman saxena";
    }
//    @GetMapping("/photoz")
//    public Collection<Photo> get(){
//        return db.values();
//    }
//    @GetMapping("/photoz/{id}")
//    public Photo get(@PathVariable String id){
//        Photo photo= db.get(id);
//        if( photo == null) throw  new ResponseStatusException(HttpStatus.NOT_FOUND);
//        return photo;
//    }
//    @PostMapping("/photoz/")
//    public void create(@RequestBody Photo photo){
//        photo.setId(UUID.randomUUID().toString());
//        db.put(photo.getId(), photo);
//        return photo;
//    }

}
