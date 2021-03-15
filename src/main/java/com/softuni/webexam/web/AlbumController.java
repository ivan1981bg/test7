package com.softuni.webexam.web;

import com.softuni.webexam.model.binding.AlbumAddBindingModel;
import com.softuni.webexam.model.service.AlbumServiceModel;
import com.softuni.webexam.service.AlbumService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/albums")
public class AlbumController {

    private final AlbumService albumService;
    private final ModelMapper modelMapper;


    public AlbumController(AlbumService albumService, ModelMapper modelMapper) {
        this.albumService = albumService;
        this.modelMapper = modelMapper;
    }


    @GetMapping("/add")
    public String albumAdd(Model model, HttpSession httpSession){

        if (httpSession.getAttribute("user") == null){
            return "redirect:/users/login";
        }
        if (!model.containsAttribute("albumAddBindingModel")){
            model.addAttribute("albumAddBindingModel", new AlbumAddBindingModel());
        }
        return "add-album";
    }

    @PostMapping("/add")
    public String addConfirm(@Valid AlbumAddBindingModel albumAddBindingModel,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes,
                             HttpSession httpSession){

        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("albumAddBindingModel", albumAddBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.albumAddBindingModel",
                    bindingResult);


            return "redirect:add";
        }


        albumService.add(modelMapper.map(albumAddBindingModel, AlbumServiceModel.class), httpSession);


        return "redirect:/";


    }


}
