/**
 * Copyright (C) 2011 ArtiVisi Intermedia <info@artivisi.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.artivisi.biller.simulator.ui.jsf.controller.pascabayar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.artivisi.biller.simulator.dto.GeneratorTagihanPascabayar;
import com.artivisi.biller.simulator.service.PlnSimulatorService;

@Controller
@Scope("request")
public class TagihanController {
	@Autowired private PlnSimulatorService plnSimulatorService;
	private GeneratorTagihanPascabayar generator = new GeneratorTagihanPascabayar();
	
	@Autowired PelangganController pelangganController;
	
	public String generate(){
		plnSimulatorService.generatePascabayar(generator);
		generator = new GeneratorTagihanPascabayar();
		pelangganController.initSemuaPelanggan();
		return "/pascabayar/pelanggan/list?faces-redirect=true";
	}
	
	public GeneratorTagihanPascabayar getGenerator() {
		return generator;
	}
}